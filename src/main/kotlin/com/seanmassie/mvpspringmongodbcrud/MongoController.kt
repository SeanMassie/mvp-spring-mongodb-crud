package com.seanmassie.mvpspringmongodbcrud

import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@RestController
class MongoController(val repo : MongoRepository) {
    @GetMapping("/")
    fun getAll() = repo.findAll()

    @PostMapping("/")
    fun createRecord(@RequestBody url : ShortUrl) : Mono<ShortUrl> {
        return repo.save(url)
    }

    @DeleteMapping("/")
    fun deleteRecord(@RequestBody url : ShortUrl) : Mono<Void> {
        return repo.deleteById(url.shortUrl)
    }
}

