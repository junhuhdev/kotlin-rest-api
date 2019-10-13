package com.huh.enterprises.hitmachine.user

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@RestController
class UserHandler(val userRepository: UserRepository) {

    fun insert(req: ServerRequest): Mono<ServerResponse> = req
            .bodyToMono(CreateUserRequest::class.java)
            .flatMap(userRepository::insert)
            .map { userId -> CreateUserResponse(id = userId) }
            .flatMap(::toServerResponse)


}