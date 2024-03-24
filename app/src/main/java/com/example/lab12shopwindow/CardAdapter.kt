package com.example.lab12shopwindow

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab12shopwindow.databinding.CardCellBinding

class CardAdapter(private val products: List<Product>, private val cartList: MutableList<Product>)
    :RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding)
    }

    override fun getItemCount(): Int = products.size

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindProduct(products[position], cartList)
    }
}