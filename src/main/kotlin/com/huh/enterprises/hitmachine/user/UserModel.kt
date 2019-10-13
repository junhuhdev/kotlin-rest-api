package com.huh.enterprises.hitmachine.user

import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

data class User(
        val id: Int,
        val name: String,
        val email: String
)

data class CreateUserRequest(
        val name: String,
        val email: String
)

data class FetchUserRequest(
        val id: Int
)

typealias CreateUserResponse = FetchUserRequest

fun toServerResponse(resp: CreateUserResponse) = ServerResponse
        .ok()
        .contentType(MediaType.APPLICATION_JSON)
        .body(Mono.just(resp), CreateUserResponse::class.java)