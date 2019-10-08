package com.example.demo.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.example.demo.entity.Snack
import com.example.demo.repository.ReviewRepository
import com.example.demo.repository.SnackRepository
import org.springframework.stereotype.Component

@Component
class SnackQueryResolver(private val reviewRepository: ReviewRepository, private val snackRepository: SnackRepository) : GraphQLQueryResolver {

    fun snacks(): List<Snack> {
        val list = snackRepository.findAll();
        for (item in list) {
            item.reviews = reviewRepository.findAllBySnackId(snackId = item.id)
        }
        return list
    }
}
