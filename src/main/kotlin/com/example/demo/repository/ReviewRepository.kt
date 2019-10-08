package com.example.demo.repository

import com.example.demo.entity.Review
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ReviewRepository : MongoRepository<Review, String> {
    fun findAllBySnackId(snackId: String): List<Review>
}
