package com.iwendy.json.reader;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonReader {
	public static JsonNode parse(final String json) {
	    ObjectMapper mapper = new ObjectMapper();
	    JsonNode jsonNode = null;
	    try {
	      final JsonParser jParser = mapper.getFactory().createParser(json);
	      jsonNode = mapper.readTree(jParser);
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	    return jsonNode;
	  }
}
