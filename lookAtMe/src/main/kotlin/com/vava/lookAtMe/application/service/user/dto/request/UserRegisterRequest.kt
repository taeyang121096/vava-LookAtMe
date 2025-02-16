package com.vava.lookAtMe.application.service.user.dto.request

import java.time.LocalDate

data class UserRegisterRequest(
    val userName: String,
    val password: String,
    val email: String,
    val gender: String,
    val birth: LocalDate,
    val phone: String
)
