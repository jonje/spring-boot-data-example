package com.example.jjensen

import com.example.jjensen.repository.AccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.context.annotation.Profile
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

/**
 * Created by jpjensen on 5/18/17.
 */
@ContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Profile("test")
class AccountSpec extends Specification {

    @Autowired
    TestRestTemplate restTemplate;

    @Autowired
    AccountRepository repository;

    def "Empty Accounts should be empty array"() {
        when: "account endpoint is hit"
        def entity = restTemplate.getForEntity("/accounts", List)
        then: "list should be empty"
        entity.body.size() == 0
    }
}
