# Test RainbowGum issue

A minimal project to show a problem I'm having with RainbowGum.

I'm seeing this error:

```
SLF4J(E): Failed to instantiate SLF4J LoggerFactory
SLF4J(E): Reported exception:
java.lang.IllegalStateException: slf4j was not initialized correctly
        at io.jstach.rainbowgum.slf4j.RainbowGumSLF4JServiceProvider.require(RainbowGumSLF4JServiceProvider.java:62)
        at io.jstach.rainbowgum.slf4j.RainbowGumSLF4JServiceProvider.getMDCAdapter(RainbowGumSLF4JServiceProvider.java:52)
        at org.slf4j.LoggerFactory.earlyBindMDCAdapter(LoggerFactory.java:227)
        at org.slf4j.LoggerFactory.bind(LoggerFactory.java:199)
        at org.slf4j.LoggerFactory.performInitialization(LoggerFactory.java:187)
        at org.slf4j.LoggerFactory.getProvider(LoggerFactory.java:511)
        at org.slf4j.LoggerFactory.getILoggerFactory(LoggerFactory.java:497)
        at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:446)
        at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:472)
        at red.ethel.rgtest.App.<clinit>(App.java:7)
```

## To reproduce

Requires JDK 25. Run:

```shell
./gradlew :app:run
```
