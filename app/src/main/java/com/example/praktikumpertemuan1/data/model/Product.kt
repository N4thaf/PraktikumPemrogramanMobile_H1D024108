package com.example.praktikumpertemuan1.data.model

data class Product(
    val id: Int,
    val category_id: Int,
    val category: Category? = null,
    val name: String,
    val description: String? = null,
    val price: Double,
    val stock: Int,
    val img: String
)