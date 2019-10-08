package com.example.demo.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.example.demo.entity.Review
import com.example.demo.repository.ReviewRepository
import org.springframework.stereotype.Component

@Component
class ReviewQueryResolver(private val reviewRepository: ReviewRepository) : GraphQLQueryResolver {
    fun reviews(snackId: String): List<Review> = reviewRepository.findAllBySnackId(snackId)
}
