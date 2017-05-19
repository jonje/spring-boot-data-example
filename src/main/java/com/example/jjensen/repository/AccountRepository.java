package com.example.jjensen.repository;

import com.example.jjensen.domain.Account;
import lombok.Data;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;

/**
 * Created by jpjensen on 5/18/17.
 */

public interface AccountRepository extends CrudRepository<Account, Long> {
}
