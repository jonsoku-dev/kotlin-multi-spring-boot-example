package com.tamastudy.ta.api

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class PersonServiceTest(
        private val personService: PersonService
) {
    @Test
    fun `test 1`() {
        println(personService.test())
    }
}