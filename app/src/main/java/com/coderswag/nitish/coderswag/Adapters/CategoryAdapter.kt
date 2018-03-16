package com.coderswag.nitish.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.coderswag.nitish.coderswag.Model.Category
import com.coderswag.nitish.coderswag.R

/**
 * Created by Nitish on 16/03/18.
 */
class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    var context = context
    var categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var categoryView: View

        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        val categoryImage: ImageView = categoryView.findViewById(R.id.categoryImage)
        val categoryText : TextView = categoryView.findViewById(R.id.categoryTextView)

        val category = categories[position]
        categoryText.text = category.title
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceId)

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }
}