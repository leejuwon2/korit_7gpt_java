package com.korit.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private List<User> userList;
    private Long id;
    private String username;
    private String password;
    private String email;
}
