package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserDAOService {

    // JPA / Hibernate -> Database
    // UserDAOService -> Static List
    private static List<User> users = new ArrayList<>();

    private static int usersCount = 0;

    static {
        users.add(new User(++usersCount, "Umer", LocalDate.now().minusYears(40)));
        users.add(new User(++usersCount, "Ali", LocalDate.now().minusYears(32)));
        users.add(new User(++usersCount, "Usman", LocalDate.now().minusYears(30)));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }

    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }

}
