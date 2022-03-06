package com.tutorials.mypets.model

data class Sample(val name: String, val imageRes: Int, val brief: String = "")

data class Pet(
    val id: String,
    val species: Species,
    val description: String,
    val samples: List<Sample>
)
