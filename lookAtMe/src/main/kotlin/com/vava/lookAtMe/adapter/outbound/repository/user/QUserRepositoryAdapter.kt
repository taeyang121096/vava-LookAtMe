package com.vava.lookAtMe.adapter.outbound.repository.user

import com.querydsl.jpa.impl.JPAQueryFactory
import com.vava.lookAtMe.core.domain.user.QUsers
import com.vava.lookAtMe.core.domain.user.Users
import org.springframework.stereotype.Repository

@Repository
class QUserRepositoryAdapter(
    private val queryFactory: JPAQueryFactory
) {

    fun findByUserName(userName: String): Users? {
        val users  = QUsers.users
        return queryFactory
            .selectFrom(users)
            .where(users.name.eq(userName))
            .fetchOne()
    }
}
