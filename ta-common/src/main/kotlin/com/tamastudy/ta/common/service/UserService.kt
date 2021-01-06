package com.tamastudy.ta.common.service

import com.tamastudy.ta.common.entity.User
import java.util.*

interface UserService {
    fun findAll(): MutableList<User>
    fun findOne(id: Long): Optional<User>
}