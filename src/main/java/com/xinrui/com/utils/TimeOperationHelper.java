package com.xinrui.com.utils;

import java.util.concurrent.TimeUnit;

/**
 * 
 * @ClassName: TimeOperationHelper
 * @Description:时间工具类
 * @author liangzhicheng
 * @date 2018年5月5日 下午1:12:23
 *
 */
public class TimeOperationHelper {
	/** 转换器(有过载保护机制) **/
	public static int convert(long sourceDuration, TimeUnit sourceUnit, TimeUnit destUnit) {
		long result = destUnit.convert(sourceDuration, sourceUnit);
		if (result <= Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		} else if (Integer.MAX_VALUE <= result) {
			return Integer.MAX_VALUE;
		} else {
			return (int) result;
		}
	}

	/** 转换成纳秒 **/
	public static int toNanos(long duration, TimeUnit sourceUnit) {
		return convert(duration, sourceUnit, TimeUnit.NANOSECONDS);
	}

	/** 转换成微秒 **/
	public static int toMicros(long duration, TimeUnit sourceUnit) {
		return convert(duration, sourceUnit, TimeUnit.MICROSECONDS);
	}

	/** 转换成毫秒 **/
	public static int toMillis(long duration, TimeUnit sourceUnit) {
		return convert(duration, sourceUnit, TimeUnit.MILLISECONDS);
	}

	/** 转换成秒 **/
	public static int toSeconds(long duration, TimeUnit sourceUnit) {
		return convert(duration, sourceUnit, TimeUnit.SECONDS);
	}

	/** 转换成分钟 **/
	public static int toMinutes(long duration, TimeUnit sourceUnit) {
		return convert(duration, sourceUnit, TimeUnit.MINUTES);
	}

	/** 转换成小时 **/
	public static int toHours(long duration, TimeUnit sourceUnit) {
		return convert(duration, sourceUnit, TimeUnit.HOURS);
	}

	/** 转换成天 **/
	public static int toDays(long duration, TimeUnit sourceUnit) {
		return convert(duration, sourceUnit, TimeUnit.DAYS);
	}

	public static void main(String[] args) {
		System.out.println(toSeconds(1000L, TimeUnit.DAYS));
	}
}
