## 111. Step 01 - Getting Started with JPA and Hibernate - Goals

***

## 112. Step 02 - Setting up New Spring Boot Project for JPA and Hibernate

### Dependencies
* web
* jdbc
* jpa
* h2

***

## 113. Step 03 - Launching up H2 Console and Creating Course Table

* Edit `application.properties`
    * spring.h2.console.enabled=true
    * spring.datasource.url=jdbc:h2:mem:testdb

* http://localhost:8080/h2-console

* Edit `resources/schema.sql`
```sql
create table course
(
    id bigint not null,
    name varchar(255) not null,
    author varchar(255) not null,
    primary key (id)
);
```

***

## 114. Step 04 - Getting Started with `Spring JDBC`

```sql
insert into course(id,name,author)
values(1,'Learn AWS','in28minutes');

select * from course

delete from course where id=1
```

***

## 115. Step 05 - Inserting Hardcoded Data using `Spring JDBC`

***

## 116. Step 06 - Inserting and Deleting Data using `Spring JDBC`

***

## 117. Step 07 - Querying Data using `Spring JDBC`

***

## 118. Step 08 - Getting Started with JPA and EntityManager

***

## 119. Step 09 - Exploring the Magic of JPA

***

## 120. Step 10 - Getting Started with Spring Data JPA

***

## 121. Step 11 - Exploring features of Spring Data JPA

***

## 122. Step 12 - Understanding difference between Hibernate and

***
































