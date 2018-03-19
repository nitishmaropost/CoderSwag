package com.coderswag.nitish.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import com.coderswag.nitish.coderswag.Adapters.CategoryAdapter
import com.coderswag.nitish.coderswag.Adapters.CategoryRecycleAdapter
import com.coderswag.nitish.coderswag.Model.Category
import com.coderswag.nitish.coderswag.R
import com.coderswag.nitish.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryRecycleAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)
    }
}
