package com.tamastudy.ta.api

import com.tamastudy.ta.common.entity.User
import com.tamastudy.ta.common.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserResource(
        private val userService: UserService
) {
    @GetMapping
    fun getUsers(): MutableList<User> {
        return userService.findAll()
    }

    @GetMapping("/test")
    fun test(): String {
        return "test"
    }
}