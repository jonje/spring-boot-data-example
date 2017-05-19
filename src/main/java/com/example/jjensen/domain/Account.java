package com.example.jjensen.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by jpjensen on 5/18/17.
 */
@Data
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<User> users;

    public void addUser(User user) {
        user.setAccount(this);
        this.users.add(user);
    }
}
