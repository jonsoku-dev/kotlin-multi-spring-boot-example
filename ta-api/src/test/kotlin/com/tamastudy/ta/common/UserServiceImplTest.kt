package com.tamastudy.ta.common

import com.tamastudy.ta.api.TaApiApplication
import com.tamastudy.ta.common.service.UserService
import com.tamastudy.ta.common.service.UserServiceImpl
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest(classes = [TaApiApplication::class])
class UserServiceImplTest {
    @Autowired
    lateinit var service: UserServiceImpl

    @Test
    fun `test`() {
        val users = service.findAll()
        println("Jonsoku $users")
    }
}