package com.coderswag.nitish.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.coderswag.nitish.coderswag.Model.Category
import com.coderswag.nitish.coderswag.R

/**
 * Created by Nitish on 19/03/18.
 */
class CategoryRecycleAdapter(val context: Context, val categories: List<Category>) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, parent, false)

        return Holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindCategory(categories[position], context)
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryText = itemView?.findViewById<TextView>(R.id.categoryTextView)

        fun bindCategory(category: Category, context: Context)
        {
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryText?.text = category.title
        }
    }
}