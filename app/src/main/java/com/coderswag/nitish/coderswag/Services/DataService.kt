package com.coderswag.nitish.coderswag.Services

import com.coderswag.nitish.coderswag.Model.Category
import com.coderswag.nitish.coderswag.Model.Product

/**
 * Created by Nitish on 16/03/18.
 */
object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val products = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Hat Black", "$20", "hat2"),
            Product("Devslopes Hat White", "$18", "hat3"),
            Product("Devslopes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoodie Red", "$30", "hoodie2"),
            Product("Devslopes Hoodie Black", "$32", "hoodie3"),
            Product("Devslopes Hoodie White", "$40", "hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Gray", "$35", "shirt1"),
            Product("Devslopes Shirt Red", "$30", "shirt2"),
            Product("Devslopes Shirt Black", "$45", "shirt3"),
            Product("Devslopes Shirt White", "$50", "shirt4"),
            Product("Kickflip Studios", "$40", "shirt5")
    )
}