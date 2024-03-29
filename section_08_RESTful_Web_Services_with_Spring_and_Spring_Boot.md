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

```xml
<dependency>
  <groupId>com.fasterxml.jackson.dataformat</groupId>
  <artifactId>jackson-dataformat-xml</artifactId>
  <version>2.15.0</version>
</dependency>
```

* Accept header 
    * application/xml
    * application/json

***

## 102. Step 19 - Exploring Internalization for REST API

### Http Accept-Language header
* en, nl, fr, ...

### Internationalization - i18n

* `resources/messages.properties`
    * good.morning.message=Good Morning

* `resources/messages_nl.properties`
    * good.morning.message=Goedemoergen

***

## 103. Resources for Next Step

***

## 104. Step 20 - Versioning REST API - URI Versioning

* Option for versioning APIs
    * URL
    * Request Parameter
    * Header
    * Media Type

### URI Versioning
    * http://localhost:8080/v1/person
    * http://localhost:8080/v2/person

***

## 105. Step 21 - Versioning REST API - Request Param, Header and Content Negotiation

***

## 106. Step 22 - Implementing HATEOS for REST API

* How about enhancing your REST API to tell consumers how to perform subsequent actions?
    * Hypermedia as the Engine of Application State (HATEOAS)
    * Spring HATEOAS generate HAL responses with hyperlinks to resources
        * HAL (JSON Hypertext Application Language)
            * Simple format that gives a consistent and easy way to hyperlink between resources in your API

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-hateoas</artifactId>
</dependency>
```

```java
    @GetMapping("/users/{id}")
    public EntityModel<User> retrieveUser(@PathVariable int id) {

        User user = service.findOne(id);

        EntityModel<User> entityModel = EntityModel.of(user);
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveUser(id));
        entityModel.add(link.withRel("all-users"));

        return entityModel;
    }
```

***

## 107. Step 23 - Implementing Static Filtering for REST API

* Serialization
    * Convert object to stream (JSON)
    * Jackson
* `@JSONProperty("user_name")`
* `@JSONProperty("birth_date")`

### Filtering
* Static Filtering
    * `@JsonIgnore`
    * `@JsonIgnoreProperties`
* Dynamic Filtering
    * `@JsonFilter`

***

## 108. Step 24 - Implementing Dynamic Filtering for REST API

***

## 109. Step 25 - Monitoring APIs with Spring Boot Actuator

* Monitor and manage your application in production

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

* Edit `application.properties`
    * management.endpoints.web.exposure.include=*

* http://localhost:8080/actuator

***

## 110. Step 26 - Exploring APIs with Spring Boot HAL Explorer

### HAL Explorer
    * An API explorer for RESTful Hypermedia APIs using HAL

```xml
<dependency>
    <groupId>org.springframework.data</groupId>
    <artifactId>spring-data-rest-hal-explorer</artifactId>
</dependency>
```

* http://localhost:8080/

***
