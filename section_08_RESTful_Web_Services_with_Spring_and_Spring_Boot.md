## 79. Step 00 - Creating a REST API with Spring Boot - An Overview

***

## 80. CODE BACKUP FILES and STEP BY STEP CHANGES: For Reference

* [Git code](https://github.com/in28minutes/spring-web-services/tree/master/restful-web-services-v2)

***

## 81. Step 01 - Initializing a REST API Project with Spring Boot

* https://start.spring.io
* ADD DEPENDENCIES
    * Spring WEB
    * Spring Data JPA
    * H2 Database
    * Spring Boot DevTools

***

## 82. Step 02 - Creating a Hello World REST API with Spring Boot

* `@RestController`
* `@GetMapping("/hello-world")` 


***

## 83. Step 03 - Enhancing the Hello World REST API to return a Bean

***

## 84. Step 04 - What's happening in the background? Spring Boot Starters and Autoconfiguration

* Edit file `application.properties`:
    * Enable `logging.level.org.springframework=debug`

### Mapping servlets: dispatcherServlet urls=[/]
* Auto Configuration (`DispatcherServletAutoConfiguration`)

### Bean to JSON conversion
* Auto Configuration (`JacksonHttpMessageConvertersConfiguration`)

### Error Mapping
* Auto Configuration(`ErrorMvcAutoConfiguration`)

***

## 85. Step 05 - Enhancing the Hello World REST API with a Path Variable

* `@PathVariable`

***

## 86. Step 06 - Designing the REST API for Social Media Application

***

## 87. Step 07 - Creating User Bean and UserDAOService

***

## 88. Resources for Next Step

***

## 89. Step 08 - Implementing GET Methods for User Resource

```java
public User findOne(int id) {
    Predicate<? super User> predicate = user -> user.getId().equals(id);
    return users.stream().filter(predicate).findFirst().get();
}
```

***

## 90. Step 09 - Implementing POST Method to create User Resource

### Rest API Client
* [Talend API Tester - Free Edition](https://chromewebstore.google.com/detail/talend-api-tester-free-ed/aejoelaoggembcahagimdiliamlcdmfm?pli=1)
 
* Response Status = 200 (success)

***

## 91. Step 10 - Enhancing POST Method to return correct HTTP Status Code and Location

```java
URI location = ServletUriComponentsBuilder
                    .fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(savedUser.getId())
                    .toUri();

return ResponseEntity.created(location).build();
```

* Response Status = 201 (created)

***

## 92. Step 11 - Implementing Exception Handling - 404 Resource Not Found

***

## 93. Resources for Next Step

***

## 94. Step 12 - Implementing Generic Exception Handling for all Resources

***

## 95. Step 13 - Implementing DELETE Method to delete a User Resource

* `@DeleteMapping("/users/{id}")` 

***

## 96. Step 14. Implementing Validations for REST API

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-validation</artifactId>
</dependency>
```

* `@valid` - `import jakarta.validation.Valid;`
    * Constraints defined on the object and its properties are validated when the property, method-parameter or method-return-type is validated.


```java
@Size(min=2, message = "Name should have atleast 2 characters.")
private String name;

@Past(message = "Birth Data should be in the past.")
private LocalDate birthDate;
```

***

## 97. Step 15. Overview of Advanced REST API Features

* Documentation
* Content Negotiation
* Internationalization - i18n
* Versioning
* HATEOAS
* Static Filtering
* Dynamic Filtering
* Monitoring

***

## 98. Step 16. Understanding Open API Specification and Swagger

* 2011 - Swagger Specification
* 2016 - Open API Specification, based on Swagger Spec.
    * Standard language-agnostic interface

***

## 99. `springdoc-openapi` Dependency for next lecture 

* [Springdoc-openapi](https://springdoc.org/)
```
This library supports:
- OpenAPI 3
- Spring-boot v3 (Java 17 & Jakarta EE 9)
- JSR-303, specifically for @NotNull, @Min, @Max, and @Size.
- Swagger-ui
- OAuth 2
- GraalVM native images
```

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.3.0</version>
</dependenc>
```

* http://localhost:8080/swagger-ui/index.html


***

## 100. Step 17 - Configuring Auto Generation of Swagger Documentation

***

## 101. Step 18 - Exploring Content Negotiation - Implementing Support for XML

***

## 102. Step 19 - Exploring Internalization for REST API

***

## 103. Resources for Next Step

***

## 104. Step 20 - Versioning REST API - URI Versioning

***

## 105. Step 21. Versioning REST API - Request Param, Header and Content Negotiation

***

## 106. Step 22. Implementing HATEOS for REST API

***

## 107. Step 23 - Implementing Static Filtering for REST API

***

## 108. Step 24 - Implementing Dynamic Filtering for REST API

***

## 109. Step 25 - Monitoring APIs with Spring Boot Actuator

***

## 110. Step 26 - Exploring APIs with Spring Boot HAL Explorer

****
