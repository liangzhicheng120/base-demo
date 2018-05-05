package com.xinrui.com.utils;

import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

/**
 * 
 * @ClassName: XSSEncode
 * @Description:跨站脚本攻击安全类
 * @author liangzhicheng
 * @date 2018年5月5日 下午12:34:46
 * @see https://blog.csdn.net/ganyingxie123456/article/details/70230486
 */
public class XSSEncode {

	// 危险的javascript:关键字javascript
	private final static Pattern[] DANGEROUS_TOKENS = new Pattern[] {
			Pattern.compile("^j\\s*a\\s*v\\s*a\\s*s\\s*c\\s*r\\s*i\\s*p\\s*t\\s*:", Pattern.CASE_INSENSITIVE) };

	// javascript:替换字符串（全角中文字符）
	private final static String[] DANGEROUS_TOKEN_REPLACEMENTS = new String[] { "ＪＡＶＡＳＣＲＩＰＴ：" };

	// 非法的字符集
	private static final char[] INVALID_CHARS = new char[] { '<', '>', '\'', '\"', '\\' };

	// 统一替换可能造成XSS漏洞的字符为全角中文字符
	private static final char[] VALID_CHARS = new char[] { '＜', '＞', '’', '“', '＼' };

	/**
	 * 对参数进行防止xss漏洞处理
	 * 
	 * @param value
	 * @return
	 */
	public static String proceedXss(String value) {
		return replaceSpecialChars(StringUtils.defaultIfBlank(value, ""));
	}

	/**
	 * 替换非法字符以及危险关键字
	 * 
	 * @param str
	 * @return
	 */
	private static String replaceSpecialChars(String str) {
		for (int j = 0; j < INVALID_CHARS.length; ++j) {
			if (str.indexOf(INVALID_CHARS[j]) >= 0) {
				str = str.replace(INVALID_CHARS[j], VALID_CHARS[j]);
			}
		}
		str = str.trim();
		for (int i = 0; i < DANGEROUS_TOKENS.length; ++i) {
			str = DANGEROUS_TOKENS[i].matcher(str).replaceAll(DANGEROUS_TOKEN_REPLACEMENTS[i]);
		}

		return str;
	}
}
