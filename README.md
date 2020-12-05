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

### dependencies

In this example FixedDepositService implicitly depends on EventSenderSelectorService because EventSenderSelectorService writes the event sender class to appConfig.properties when it is constructed and FixedDepositService reads the event sender class from appConfig.properties when it is constructed. There are two ways to solve this: either define EventSenderSelectorService first in applicationContext.xml or explicitly specify the dependency using the depends-on attribute. This example uses the depends-on attribute.

Note: in this example, CustomerRequestServiceImpl always returns the same CustomerRequestDetails object, even though CustomerRequestDetails is prototype scoped. This is because CustomerRequestDetails gets injected into CustomerRequestServiceImpl when CustomerRequestServiceImpl is created. This is certainly not the expected behavior
when calling the submitRequest method.

### context-aware

This is a refined version of the dependencies example where CustomerRequestServiceImpl implements the ApplicationContextAware interface and submitRequest will create a new CustomerRequestDetails object using the application context everytime it is called.

Note: there are other ways to make the submitRequest method return a new CustomerRequestDetails everytime it is called: using the lookup-method element and the replaced-method element. Using these elements, Spring creates a derived class where the submitRequest method is overriden to return a new instance of the CustomerRequestDetails object everytime it is called. I think using an interface is cleaner.

### autowiring

This example demonstrates the Spring autowiring feature: Spring figures out dependencies itself using types of constructor arguments, setter arguments etc.
The downside is that it makes it hard to understand the app structure when looking at applicationContext.xml.
