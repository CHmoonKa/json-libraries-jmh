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
 

Result sample
===========

Benchmark                          Mode Thr    Cnt  Sec         Mean   Mean error    Units <br/>
c.i.j.JsonBenchmark.FastJson      thrpt   1      3    5       81.911        1.624  ops/sec <br/>
c.i.j.JsonBenchmark.GSON          thrpt   1      3    5       45.917        8.851  ops/sec <br/>
c.i.j.JsonBenchmark.Jackson       thrpt   1      3    5       65.361        2.695  ops/sec <br/>
c.i.j.JsonBenchmark.Jettison      thrpt   1      3    5       36.422        2.544  ops/sec <br/>
c.i.j.JsonBenchmark.JsonSimple    thrpt   1      3    5       23.467        1.501  ops/sec <br/>
c.i.j.JsonBenchmark.JsonSmart     thrpt   1      3    5       28.011        2.136  ops/sec <br/>
c.i.j.JsonBenchmark.OrgJson       thrpt   1      3    5       21.278        0.650  ops/sec <br/>
