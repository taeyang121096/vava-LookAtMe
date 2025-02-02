package com.vava.lookAtMe.core.domain.user

import jakarta.persistence.Embeddable

@Embeddable
data class Role(
    val role: RoleType
)

enum class RoleType {
    USER, ADMIN
}