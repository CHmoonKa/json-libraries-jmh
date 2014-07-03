package com.iwendy.json.reader;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class FastJsonReader {
	public static JSONObject parse(final String json) {
		JSONObject ret = JSON.parseObject(json);
		
		return ret;
	}
}
