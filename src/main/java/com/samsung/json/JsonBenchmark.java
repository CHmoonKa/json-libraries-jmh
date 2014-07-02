package com.samsung.json;

import java.io.StringReader;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.GenerateMicroBenchmark;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.logic.BlackHole;

import com.samsung.json.reader.FastJsonReader;
import com.samsung.json.reader.GSONReader;
import com.samsung.json.reader.JacksonReader;
import com.samsung.json.reader.JettisonReader;
import com.samsung.json.reader.JsonSimpleReader;
import com.samsung.json.reader.JsonSmartReader;
import com.samsung.json.reader.OrgJsonReader;
import com.samsung.json.util.DataProvider;

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
    public void FastJson(BlackHole bh) throws Exception {
        bh.consume(FastJsonReader.parse(DataProvider.doc3k()));
    }
	
	@GenerateMicroBenchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void OrgJson(BlackHole bh) throws Exception {
        bh.consume(OrgJsonReader.parse(DataProvider.doc3k()));
    }
}
