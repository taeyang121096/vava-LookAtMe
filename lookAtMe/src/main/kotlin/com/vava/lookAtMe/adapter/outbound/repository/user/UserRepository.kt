package com.vava.lookAtMe.adapter.outbound.repository.user

import com.vava.lookAtMe.core.domain.user.Users
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<Users, Long> {
}
