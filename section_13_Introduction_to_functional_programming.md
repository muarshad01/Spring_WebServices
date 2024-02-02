## 142. Step 00 - Introduction to Functional Programming

* Lambda Functions
* Streams
* Filters

***

## 143 - Step 01 - Getting Started with Functional Programming with Java

```java
List<Integer> numbers;

public static void print(int number) {
    System.out.println(number)
}

numbers.stream()
    .forEach(ClassName::print); //Method Reference
```

***

## 144 - Step 02 - Writing Your First Java Functional Program

```java
numbers.stream()
    .forEach(System.out::println); //Method Reference
```

***

## 145. - Step 03 - Improving Java Functional Program with filter

```java
private static boolean isEven(int number) {
    return number%2 == 0;
}

numbers.stream()
    .filter(ClassName::isEven); // Filter 
    .forEach(System.out::println); //Method Reference
```

***

## 146. - STEP 04 - Using Lambda Expression to enhance your

```java
numbers.stream()
    .filter(number -> number%2 == 0);   // Lambda Expression
    .forEach(System.out::println);      // Method Reference
```

***

## 147. - Step 05 - Do Functional Programming Exercises with

```java
List<String> courses = 
        List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");

courses.stream()
    .filter(course -> course.contains("Spring"))
    .forEach(System.out::println)
```

***

## 148. - Step 06 - Using map in Functional Programs 

### Square of Even numbers
```java
numbers.stream()
    .filter(number -> number % 2 == 0);   // Lambda Expression
    .map(number -> number * number)
    .forEach(System.out::println);      // Method Reference
```

### Cube of Odd numbers
```java
numbers.stream()
    .filter(number -> number % 2 != 0);
    .map(number -> number * number * number)
    .forEach(System.out::println);      // Method Reference
```

### Course length
```java
numbers.stream()
    .map(course -> course + " " + course.length());
    .forEach(System.out::println);      // Method Reference
```

***

## 149. - Step 07 - Understanding Optional class in Java

```java
List<String> fruits = List.of("apple", "banana", "mango");

Predicate<? super String> predicate = fruit -> fruit.startsWith("b");
Optional<String> optional = fruits.stream().filter(predicate).findFirst();
System.out.println(optional);
System.out.println(optional.isEmpty());
System.out.println(optional.isPresent());
System.out.println(optional.get());
```

***

## 150. - Step 08 - Quick Review of Functional Programming Basics

***
