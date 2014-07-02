package com.samsung.json.reader;

import java.io.Reader;

import net.minidev.json.parser.JSONParser;

public class JsonSmartReader {
	private static JSONParser parser = new JSONParser(
			JSONParser.DEFAULT_PERMISSIVE_MODE);

	public static Object parse(Reader reader) throws Exception {
		return parser.parse(reader);
	}
}
