package com.tutorials.mypets.model

data class Sample(
    val name: String,
    override val imageRes: Int,
    val brief: String = "Hello, I'm cute!!!",
    val sex: Sex = Sex.Male,
    val age: Int = 2,
    val weight: Float = 4.5f
) : ImageRes(imageRes)

data class Pet(
    val id: String,
    val species: Species,
    val description: String,
    val samples: List<Sample>,
)
