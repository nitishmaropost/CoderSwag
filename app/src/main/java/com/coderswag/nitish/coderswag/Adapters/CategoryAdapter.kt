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
import com.coderswag.nitish.coderswag.R.id.categoryImage

/**
 * Created by Nitish on 16/03/18.
 */
class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    var context = context
    var categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var categoryView: View
        val holder: ViewHolder

        if (convertView == null){
            holder = ViewHolder()
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
             holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
             holder.categoryText = categoryView.findViewById(R.id.categoryTextView)
            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }




        val category = categories[position]
        holder.categoryText?.text = category.title
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)

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

    private class ViewHolder{

        var categoryImage: ImageView? = null
        var categoryText: TextView? = null
    }
}