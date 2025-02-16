package com.vava.lookAtMe.core.port.out.user

import com.vava.lookAtMe.core.domain.user.Users

interface UserRepositoryPort {

    fun save(user: Users): Users

    fun findByUserName(userName: String): Users?
}
