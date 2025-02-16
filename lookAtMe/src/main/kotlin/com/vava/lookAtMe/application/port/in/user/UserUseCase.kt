package com.vava.lookAtMe.application.port.`in`.user

import com.vava.lookAtMe.application.service.user.dto.request.UserRegisterRequest
import com.vava.lookAtMe.application.service.user.dto.response.UserResponse

interface UserUseCase {

    fun registerUser(request: UserRegisterRequest): UserResponse

}
