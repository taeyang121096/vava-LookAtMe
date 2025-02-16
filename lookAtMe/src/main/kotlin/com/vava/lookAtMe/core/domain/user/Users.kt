package com.vava.lookAtMe.core.domain.user

import jakarta.persistence.*
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(name = "users")
data class Users(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val email: String,

    @Column(nullable = false)
    val password: String,

    @Column(nullable = false)
    val gender: String,

    @Column(nullable = false)
    val birth: LocalDate,

    @Column(nullable = false)
    val phone: String,

    @Column(nullable = false)
    val active: Boolean,

    @Column(nullable = false)
    val joinDate: LocalDateTime,

    val quitDate: LocalDateTime? = null,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val role: Role
)
