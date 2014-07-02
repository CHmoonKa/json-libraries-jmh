package com.iwendy.json.reader;

import org.json.JSONObject;

public class OrgJsonReader {
	public static Object parse(final String json) {
		JSONObject jo = new JSONObject(json);
		return jo;
	}
}
