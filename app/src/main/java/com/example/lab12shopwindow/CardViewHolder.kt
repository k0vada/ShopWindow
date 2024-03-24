package com.example.lab12shopwindow

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import com.example.lab12shopwindow.databinding.CardCellBinding
import com.google.android.material.snackbar.Snackbar
class CardViewHolder(private val cardCellBinding: CardCellBinding) : RecyclerView.ViewHolder(cardCellBinding.root) {
    fun bindProduct(product: Product, cartList: MutableList<Product>){
        cardCellBinding.imageProduct.setImageResource(product.image)
        cardCellBinding.textProductName.text = product.name
        cardCellBinding.textProductPrice.text = "Цена: ${product.price.toString()}₽"

        cardCellBinding.buttonAddToCart.setOnClickListener {
            if (product.isAddedToCart) {
                product.isAddedToCart = false
                cartList.remove(product)
                showSnackbar("Удалено: ${product.name}",product.isAddedToCart)
            } else {
                product.isAddedToCart = true
                cartList.add(product)
                showSnackbar("Добавлено: ${product.name}", product.isAddedToCart)
            }
            updateCartIcon(product.isAddedToCart)
        }
    }

    private fun showSnackbar(message: String, isAdded: Boolean) {
        val snackbar = Snackbar.make(cardCellBinding.root, message, Snackbar.LENGTH_SHORT)
        if (isAdded) snackbar.view.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            else snackbar.view.backgroundTintList = ColorStateList.valueOf(Color.RED)
        snackbar.show()
    }

    private fun updateCartIcon(isAdded: Boolean) {
        val iconRes = if (isAdded) R.drawable.shopping_cart else R.drawable.shopping_cart_add
        cardCellBinding.buttonAddToCart.setImageResource(iconRes)
    }
}