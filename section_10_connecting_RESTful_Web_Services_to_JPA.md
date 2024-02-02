## 123. Step 27 - Connecting REST API to H2 using JPA and Hibernate

***

## 124. Step 28 - Creating User Entity and some test data

* `user` is a keyword in `h2` so we'd need to rename our table
* `@Entity(name = "user_details")`
* `@Id`
* `@GeneratedValue`

* Edit `application.properties`
```
logging.level.org.springframework=info
management.endpoints.web.exposure.include=*
spring.datasource.url=jdbc:h2:mem:testdb
spring.jpa.defer-datasource-initialization=true
spring.jpa.show-sql=true
```

***

## 125. Step 29 - Enhancing REST API to connect to H2 using JPA and

***

## 126. Step 30 - Creating Post Entity with Many to One Relationship with

* `@OneToMany`
* `@ManyToAny(fetch = FetchType.LAZY)`
* `@JsonIgnore`


***

## 127. Step 31 - Implementing a GET API to retrieve all Posts of a User

***

## 128. Step 32 - Implementing a POST API to create a Post for a User

***

## 129. Step 33 - Exploring JPA and Hibernate Queries for REST API

***

## 130 - Step 34 - Connecting REST API to MySQL Database - AN Overview

***

## 131 - Step 34z - OPTIONAL - Installing Docker

***

## 132 - Resources for Next Step

***

## 133 - Course Update: Changes to MySQL connector

***

## 134 - Step 35 - OPTIONAL - Connecting REST API to MySQL

```
$ docker version
client:
server:
```

### Launch MySQL as Docker Container
```docker
docker run --detach --env MYSQL_ROOT_PASSWORD=dummypassword --env MYSQL_USER=social-media-user --env MYSQL_PASSWORD=dummypassword --env MYSQL_DATABASE=social-media-database --name mysql --publish 3306:3306 mysql:8-oracle
```
* Note, If port 3306 is already in use then try another port.

```
$docker container ls
```

* `mysqlsh`

***

## 135 - Step 36 - Implementing Basic Authentication with Spring Security

***

## 136 - Step 37 - Enhancing Spring Security Configuration for Basic

***












