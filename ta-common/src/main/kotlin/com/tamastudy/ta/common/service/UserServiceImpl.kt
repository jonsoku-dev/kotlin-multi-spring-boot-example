package com.tamastudy.ta.common.service

import com.tamastudy.ta.common.entity.User
import com.tamastudy.ta.common.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl(
        private val userRepository: UserRepository
) : UserService {
    override fun findAll(): MutableList<User> {
        return userRepository.findAll()
    }

    override fun findOne(id: Long): Optional<User> {
        return userRepository.findById(id)
    }
}