package com.seanmassie.mvpspringmongodbcrud

import org.springframework.web.bind.annotation.*

@RestController
class MongoController(val repo : MongoRepository) {
    @GetMapping("/")
    fun getAll() = repo.findAll()

    @PostMapping("/")
    fun createRecord(@RequestBody url : ShortUrl) {
        repo.save(url)
    }

    @DeleteMapping("/")
    fun deleteRecord(@RequestBody url : ShortUrl) {
        repo.deleteById(url.shortUrl)
    }
}

