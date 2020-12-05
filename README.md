# bankapp

Examples from the book *Getting started with Spring, 4th edition* converted to Kotlin

## Organization

Various examples are contained in sub-directories and and are self-contained.

### basic

A very basic example that shows how the spring container creates objects (called beans) and sets dependencies using setter methods

### refined

A refined version of the basic example that uses interfaces and constructor dependency injection

### innerbeans

A slightly modified version of the refined bankapp that uses inner beans to define dependencies in applicationContext.xml

## dependencies

In this example FixedDepositService implicitly depends on EventSenderSelectorService because EventSenderSelectorService writes the event sender class to appConfig.properties when it is constructed and FixedDepositService reads the event sender class from appConfig.properties when it is constructed. There are two ways to solve this: either define EventSenderSelectorService first in applicationContext.xml or explicitly specify the dependency using the depends-on attribute. This example uses the depends-on attribute.
