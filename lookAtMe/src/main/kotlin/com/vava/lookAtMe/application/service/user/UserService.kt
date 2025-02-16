package com.vava.lookAtMe.application.service.user

import com.vava.lookAtMe.application.port.`in`.user.UserUseCase
import com.vava.lookAtMe.application.service.user.dto.request.UserRegisterRequest
import com.vava.lookAtMe.application.service.user.dto.response.UserResponse
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class UserService: UserUseCase {

    @Transactional
    override fun registerUser(request: UserRegisterRequest): UserResponse {
        return UserResponse(1, "vava")
    }
}
