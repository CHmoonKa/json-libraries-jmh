package com.iwendy.json.util;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DataProvider {
	private static String doc3k;
	
    public static String doc3k() {
    	if(doc3k != null){
    		return doc3k;
    	}
    	 try {
    		 final String location = "data/doc10.json";
             Path resourcePath = Paths.get(location);
             doc3k = new String(Files.readAllBytes(resourcePath));
             return doc3k;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }
}
