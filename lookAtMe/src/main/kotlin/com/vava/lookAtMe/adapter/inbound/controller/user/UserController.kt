package com.vava.lookAtMe.adapter.inbound.controller.user

import com.vava.lookAtMe.application.port.`in`.user.UserUseCase
import com.vava.lookAtMe.application.service.user.dto.request.UserRegisterRequest
import com.vava.lookAtMe.application.service.user.dto.response.UserResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/users")
class UserController (
    private val userUseCase: UserUseCase
) {

    @PostMapping
    fun registerUser(@RequestBody request: UserRegisterRequest): ResponseEntity<UserResponse> {
        return ResponseEntity.ok(userUseCase.registerUser(request))
    }

}
