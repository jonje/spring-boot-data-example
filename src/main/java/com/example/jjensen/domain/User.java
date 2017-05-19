package com.example.jjensen.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by jpjensen on 5/18/17.
 */
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "account_id")
    @JsonBackReference
    private Account account;

    private String email;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
