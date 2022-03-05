package com.tutorials.mypets.model

data class Pet(
    val id: Long,
    val name: String,
    val species: Species,
    val resource: Int,
    val description: String
)
