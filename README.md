# Dependancy-Injection 

Dependancy Injection is a design pattern of spring IoC(Inversion Of Control).DI provide one object require to use other object from outside. 

Dependancy Injection Advantage
1. Loosely Coupled- High priority class not depend on low priority class so it removes class depenedancy on each other. 
2. Testing- easy to test and modification

Dependany Injection
1.by construster
2.by setter method

Also we can use dependancy injection on class,method and filed

Spring have annotation library for dependancy injection
1.@Configuration- Spring contains special class for configuration of source file. @configuration is use on spring configuration class.
2.@Autowired- It's wire all dependancy automatically. @autowired used on field to wire other service functionality into current class.
3.@Component- This annotation define class as a component.
4.@ComponentScan- @ComponentScan tell spring to find annoted components.
5.@service- It's define class as service that can be used into other class using @Autowire annotation.

