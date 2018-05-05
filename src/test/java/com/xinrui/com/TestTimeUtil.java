package com.xinrui.com;

import java.util.ArrayList;
import java.util.List;

import com.xinrui.com.time.TimeNormalizer;
import com.xinrui.com.time.TimeUnit;
import com.xinrui.com.time.util.DateUtil;
import com.xinrui.com.utils.Constants;

/**
 * 
 * @ClassName: TestTimeUtil
 * @Description:时间语义抽取测试
 * @author liangzhicheng
 * @date 2018年5月5日 下午3:15:23
 *  
 */
public class TestTimeUtil {

	public static void main(String[] args) {
		String text = "今天下午三点开会";
		String path = TimeNormalizer.class.getResource("").getPath();
		String classPath = path.substring(0, path.indexOf(Constants.PACKAGE_PATH));
		TimeNormalizer normalizer = new TimeNormalizer(classPath + Constants.TIME_EXPRESSION);
		normalizer.parse(text);
		TimeUnit[] unit = normalizer.getTimeUnit();
		List<String> result = new ArrayList<String>();
		for (TimeUnit timeUnit : unit) {
			result.add(DateUtil.formatDateDefault(timeUnit.getTime()) + "-" + timeUnit.getIsAllDayTime());
		}
		System.out.println(result);
	}

}
