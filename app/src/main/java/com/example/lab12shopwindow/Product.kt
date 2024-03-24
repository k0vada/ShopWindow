package com.example.lab12shopwindow

var productList = mutableListOf<Product>()

class Product(
    val image: Int,
    val name: String,
    val price: Double,
    var isAddedToCart: Boolean = false,
    val id: Int? = productList.size
)