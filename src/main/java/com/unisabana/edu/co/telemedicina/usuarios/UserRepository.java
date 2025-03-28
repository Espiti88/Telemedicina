package com.unisabana.edu.co.telemedicina.usuarios;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    private List<User> users = new ArrayList<>();

    public UserRepository() {

        User user1 = new User();
        user1.setCedula("0123456789");
        user1.setPassword("password1");

        User user2 = new User();
        user2.setCedula("9876543210");
        user2.setPassword("password2");

        users.add(user1);
        users.add(user2);
    }

    public Optional<User> findByCedula(String cedula) {
        return users.stream()
                .filter(user -> user.getCedula().equals(cedula))
                .findFirst();
    }

    public List<User> getAll() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }
}

