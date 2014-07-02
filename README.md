json libraries benchmark with jmh
===========

http://www.json.org/ lists various json libraries for different language <br/>

This was setup by below 2 blog posts about JMH:<br/>
http://psy-lob-saw.blogspot.com/2013/05/using-jmh-to-benchmark-multi-threaded.html<br/>
http://psy-lob-saw.blogspot.com/2013/04/writing-java-micro-benchmarks-with-jmh.html<br/>

The JMH framework is hosted here: http://openjdk.java.net/projects/code-tools/jmh/<br/>

Run
===========

1. mvn clean package
2. java -jar target/microbenchmarks.jar -wi 2 -i 3 ".*JsonBenchmark.*"
