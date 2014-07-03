package com.iwendy.json;

import java.io.StringReader;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.GenerateMicroBenchmark;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.logic.BlackHole;

import com.alibaba.fastjson.JSONObject;
import com.iwendy.json.reader.FastJsonReader;
import com.iwendy.json.reader.GSONReader;
import com.iwendy.json.reader.JacksonReader;
import com.iwendy.json.reader.JettisonReader;
import com.iwendy.json.reader.JsonSimpleReader;
import com.iwendy.json.reader.JsonSmartReader;
import com.iwendy.json.reader.OrgJsonReader;
import com.iwendy.json.util.DataProvider;

public class JsonBenchmark {
	
	@GenerateMicroBenchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void Jettison(BlackHole bh) throws Exception {
        bh.consume(JettisonReader.parse(DataProvider.doc3k()));
    }
	
	@GenerateMicroBenchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void GSON(BlackHole bh) throws Exception {
        bh.consume(GSONReader.parse(new StringReader(DataProvider.doc3k())));
    }
	
	@GenerateMicroBenchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void Jackson(BlackHole bh) throws Exception {
        bh.consume(JacksonReader.parse(DataProvider.doc3k()));
    }
	
	@GenerateMicroBenchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void JsonSimple(BlackHole bh) throws Exception {
        bh.consume(JsonSimpleReader.parse(DataProvider.doc3k()));
    }
	
	@GenerateMicroBenchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void JsonSmart(BlackHole bh) throws Exception {
        bh.consume(JsonSmartReader.parse(new StringReader(DataProvider.doc3k())));
    }
	
	@GenerateMicroBenchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    public JSONObject FastJson() throws Exception {
        return FastJsonReader.parse(DataProvider.doc3k());
    }
	
	@GenerateMicroBenchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    public Object OrgJson() throws Exception {
		return OrgJsonReader.parse(DataProvider.doc3k());
    }
}
