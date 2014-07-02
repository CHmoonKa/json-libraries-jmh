package com.iwendy.json.reader;

import java.io.Reader;
import java.util.Map;

import com.google.gson.Gson;

public class GSONReader {
	private static final Gson GSON = new Gson();

	public static Object parse(Reader reader) {
		return GSON.fromJson(reader, Map.class);
	}
}
