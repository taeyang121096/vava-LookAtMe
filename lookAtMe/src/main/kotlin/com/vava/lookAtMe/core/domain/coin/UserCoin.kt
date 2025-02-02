package com.vava.lookAtMe.core.domain.coin

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
data class UserCoin(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val userId: Long,
    val coinId: Long,
    val createDate: LocalDateTime
)
