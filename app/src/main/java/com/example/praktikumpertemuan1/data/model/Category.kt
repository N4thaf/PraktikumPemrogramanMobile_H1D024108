package com.example.praktikumpertemuan1.data.model

data class Category(
    val id: Int,
    val name: String,
    val description: String? = null,
    val products_count: Int? = null
)