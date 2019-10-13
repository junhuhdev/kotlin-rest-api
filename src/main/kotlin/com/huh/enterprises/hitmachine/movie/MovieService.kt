package com.huh.enterprises.hitmachine.movie

import org.springframework.stereotype.Service

@Service
class MovieService {

    fun select(): Movie {
        return Movie("The Avengers")
    }

    fun selectAll(): List<Movie> {
        return listOf(
                Movie("Batman Begins"),
                Movie("Dark Knight"),
                Movie("Superman Returns"))
    }

}