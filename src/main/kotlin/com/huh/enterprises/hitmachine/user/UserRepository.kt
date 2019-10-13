package com.huh.enterprises.hitmachine.user

import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface UserRepository {
    fun insert(req: CreateUserRequest): Mono<Int>
    fun select(req: FetchUserRequest): Mono<User>
    fun selectAll(): Flux<User>
}

@Repository
class UserRepositoryImpl : UserRepository {
    override fun insert(req: CreateUserRequest): Mono<Int> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun select(req: FetchUserRequest): Mono<User> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun selectAll(): Flux<User> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}