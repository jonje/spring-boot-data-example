package com.example.jjensen.resource;

import com.example.jjensen.domain.Account;
import com.example.jjensen.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jpjensen on 5/19/17.
 */
@RestController
@RequestMapping("accounts")
public class AccountController {

    private AccountRepository accountRepository;

    @Autowired
    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @RequestMapping(name = "", method = RequestMethod.GET)
    public Iterable<Account> getAccounts() {
        return accountRepository.findAll();
    }
}
