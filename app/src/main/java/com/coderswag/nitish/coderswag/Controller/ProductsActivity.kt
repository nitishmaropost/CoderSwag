package com.coderswag.nitish.coderswag.Controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.widget.GridLayout
import com.coderswag.nitish.coderswag.Adapters.ProductsAdapter
import com.coderswag.nitish.coderswag.R
import com.coderswag.nitish.coderswag.Services.DataService
import com.coderswag.nitish.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProducts(categoryType))
        productsListView.adapter = adapter

        var orientation = resources.configuration.orientation
        var numColumns = 2
        if(orientation == Configuration.ORIENTATION_PORTRAIT)
        {
            numColumns = 2
        }
        else
        {
            numColumns = 3
        }

        var screenSize = resources.configuration.screenHeightDp
        if(screenSize > 720)
        {
            numColumns = 3
        }

        val layoutManager = GridLayoutManager(this, numColumns)
        productsListView.layoutManager = layoutManager
        productsListView.setHasFixedSize(true)

    }
}
