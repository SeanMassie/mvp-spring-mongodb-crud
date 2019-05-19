package com.seanmassie.mvpspringmongodbcrud

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MongoRepository : ReactiveCrudRepository<ShortUrl, String> {

}