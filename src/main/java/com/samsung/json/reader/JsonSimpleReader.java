package com.samsung.json.reader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonSimpleReader {
	private static JSONParser parser = new JSONParser();
	
	public static JSONObject parse(final String json) {
		try {
			Object obj = parser.parse(json);
			JSONObject jsonObject = (JSONObject) obj;
			return jsonObject;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
