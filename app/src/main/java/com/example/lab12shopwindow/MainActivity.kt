package com.example.lab12shopwindow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.lab12shopwindow.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val cartList = mutableListOf<Product>()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateProducts()

        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 1)
            adapter = CardAdapter(productList, cartList)
        }
    }

    private fun populateProducts() {
        val product1 = Product(
            R.drawable.food01,
            "Арахисовая паста",
            179.99
        )
        productList.add(product1)

        val product2 = Product(
            R.drawable.food02,
            "Пицца",
            300.99
        )
        productList.add(product2)
        val product3 = Product(
            R.drawable.food03,
            "Рис",
            90.99
        )
        productList.add(product3)
        val product4 = Product(
            R.drawable.food04,
            "Брокколи",
            179.99
        )
        productList.add(product4)

        val product5 = Product(
            R.drawable.food05,
            "Сыр",
            250.99
        )
        productList.add(product5)

        val product6 = Product(
            R.drawable.food06,
            "Каша",
            50.99
        )
        productList.add(product6)

        val product7 = Product(
            R.drawable.food07,
            "Сок",
            70.99
        )
        productList.add(product7)

        val product8 = Product(
            R.drawable.food08,
            "Курица",
            100.99
        )
        productList.add(product8)

        val product9 = Product(
            R.drawable.food09,
            "Рыба",
            169.99
        )
        productList.add(product9)

        val product10 = Product(
            R.drawable.food10,
            "Гриб",
            109.99
        )
        productList.add(product10)

        val product11 = Product(
            R.drawable.food11,
            "Краб",
            999.99
        )
        productList.add(product11)

        val product12 = Product(
            R.drawable.food12,
            "Мороженное",
            69.99
        )
        productList.add(product12)

        val product13 = Product(
            R.drawable.food13,
            "Джем",
            109.99
        )
        productList.add(product13)

        val product14 = Product(
            R.drawable.food14,
            "Картошка фри",
            159.99
        )
        productList.add(product14)

        val product15 = Product(
            R.drawable.food15,
            "Суши",
            199.99
        )
        productList.add(product15)

        val product16 = Product(
            R.drawable.food16,
            "Пончик",
            49.99
        )
        productList.add(product16)

        val product17 = Product(
            R.drawable.food17,
            "Хлеб",
            39.99
        )
        productList.add(product17)

        val product18 = Product(
            R.drawable.food18,
            "Морковь",
            59.99
        )
        productList.add(product18)

        val product19 = Product(
            R.drawable.food19,
            "Яица",
            159.99
        )
        productList.add(product19)

        val product20 = Product(
            R.drawable.food20,
            "Торт",
            179.99
        )
        productList.add(product20)
    }
}