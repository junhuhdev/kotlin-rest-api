package com.huh.enterprises.hitmachine.config

import com.huh.enterprises.hitmachine.user.UserHandler
import org.springframework.context.annotation.Bean
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.router

@Component
class Router {

    @Bean
    fun router(userHandler: UserHandler) = router {
        contentType(MediaType.APPLICATION_JSON).nest {
            GET("/api/users")
            GET("/api/users/:id")
            POST("/api/users", userHandler::insert)
            PUT("/api/users/:id")
            DELETE("/api/users/:id")
        }
    }

}