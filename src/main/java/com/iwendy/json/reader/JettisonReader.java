package com.iwendy.json.reader;

import org.codehaus.jettison.json.JSONObject;

public class JettisonReader {

	public static Object parse(final String json) {
		try {
			JSONObject obj = new JSONObject(json);
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
