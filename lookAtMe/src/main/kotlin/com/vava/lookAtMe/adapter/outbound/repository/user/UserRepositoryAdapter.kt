package com.vava.lookAtMe.adapter.outbound.repository.user

import com.vava.lookAtMe.core.domain.user.Users
import com.vava.lookAtMe.core.port.out.user.UserRepositoryPort
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryAdapter (
    private val userRepository: UserRepository,
    private val userQueryDsl: QUserRepositoryAdapter
) : UserRepositoryPort {

    override fun save(user: Users): Users {
        return userRepository.save(user)
    }

    override fun findByUserName(userName: String): Users? {
        return userQueryDsl.findByUserName(userName)
    }
}
