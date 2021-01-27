package com.example.recyclerview

import android.widget.ImageView
import androidx.annotation.DrawableRes

data class Product(
    val id: Int,
    val title: String,
    @DrawableRes
    val image: Int
)



