## 28. Step 01 - Getting Started with Spring Boot - Goals

* `Spring Boot` was introduced in 2016
* What is the need for Spring Boot?
* Understand the MAGIC of Spring Boot

* Spring Initializr
    * Starter Projects
    * Auto Configuration
    * Developer Tools
    * Actuator

* `Spring Boot` vs `Spring` MVC vs `Spring`

***

## 29. Step 02 - Understanding the World Before Spring Before Spring Boot - 10,000 Feet Overview

* Dependency Management (`pom.xml`)
* Web App Configuration (`web.xml`)
* Manage Spring Beans (`context.xml`)
* Implement Non Functional Requirements (NFRs)
    * Logging / Error Handling / Monitoring
* Component Scan / View Resolver

***

## 30. Step 03 - Setting up New Spring Boot Project with Spring Initializr

***

## 31. Step 04 - Build a Hello World API with Spring Boot

* http://localhost:8080/courses

### URI Mapping
* `@RestController`
* `@RequestMapping("/courses")`

***

## 32. Step 05 - Understanding the Goal of Spring Boot

* Help you build PRODUCTION-READY apps QUICKLY
* Build Quickly
    * Spring Initializr
    * Spring Boot Starter Projects
    * Spring Boot Auto Configuration
    * Spring Boot DevTools

* Be PRODUCTION-READY
    * Logging
    * Different Configuration for Different Environments
    * Monitoring (Spring Boot Actuator)

***

## 33. Step 06 - Understanding Spring Boot Magic - Spring Boot Started Projects

* Web Application & REST API
    * Spring Boot Starter Web
        * `spring-web`
        * `spring-webmvc`
        * `spring-boot-starter-tomcat`
        * `spring-boot-starter-json`
* Unit Tests
    * Sprint Boot Starter Test
* Talk to database using JPA
    * Spring Boot Starter Data JPA
* Talk to database using JDBC
    * Spring Boot Starter JDBC
* Secure your web application or REST API
    * Spring Boot Starter Security

***

## 34. Step 07 - Understanding Spring Boot Magic - Auto Configuration

* Auto Configuratin: Automated configuration for your app
    * Decided bases on:
        * Which frameworks are in the Class Path?
        * What is the existing configuration (Annotation, etc.)?

* `application.properties`
    * `logging.level.org.springframework=debug`

* Example: Spring Bot Starter Web
    * Dispatcher Servlet
        * `DispatcherServletAutoConfiguration`
    * Embedded Servlet Containter
        * `EmbeddedWebServerFactoryCustomizerAutoConfiguration`
    * Default Error Pages
        * `ErrorMvcAutoConfiguration`
    * Bean <-> JSON
        * `JacksonHttpMessageConvertersConfiguation`

***

## 35. Step 08 - Build Faster with `Spring Boot DevTools`

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
</dependency>
```

***

## 36. Step 09 - Get Production Ready with Spring Boot -1- Profiles

### Application Environments
* dev
* qa
* staging
* prod

### Logging levels
* trace
* debug
* info
* warning
* error
* off

***

## 37. Step 10 - Get Production Ready with Spring Boot -2- Configuration Properties

* `@ConfigurationProperties(perfix="currency-service")`

***

## 38. Step 11 - Get Production Ready with Spring Boot -3- Embedded Servers

***

## 39. Step 12 - Get Production Ready with Spring Boot -4- Actuator

***

## 40. Step 13 - Understanding Spring Book vs Spring vs Spring MVC

***

## 41. Step 14 - Getting Started with Spring Book - Review

***
