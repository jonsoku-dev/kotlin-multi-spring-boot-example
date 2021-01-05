package com.tamastudy.ta.api

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

internal class PersonServiceTest{
    @Test
    fun `test 1`() {
        Assertions.assertThat(2).isEqualTo(2)
    }
}