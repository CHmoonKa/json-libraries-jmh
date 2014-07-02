package com.samsung.json.reader;

import java.util.Map;

import com.alibaba.fastjson.JSON;

public class FastJsonReader {
	public static Object parse(final String json) {
		return JSON.parseObject(json, Map.class);
	}
}
