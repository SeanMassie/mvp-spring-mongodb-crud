package com.seanmassie.mvpspringmongodbcrud

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MongoController {
    @GetMapping("/")
    fun getAll() = "Test"
}