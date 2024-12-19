package com.korit.repository;


import com.korit.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static UserRepository instance; //스태틱 인스턴스
    private List<User> userList;

    private UserRepository() {
        userList = new ArrayList<>();
    }

    public static UserRepository getInstance() { // get 인스턴스
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    public void addUser(User user) {
        userList.add(user);
    }

}
