package com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.model.Category
import com.example.coderswag.R
import com.example.coderswag.databinding.CategoryListItemBinding

class CategoryRecycleAdapter(val context:Context,val categories: List<Category>) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
//        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item,parent,false)
//        return Holder(view)
        val layoutInflater = LayoutInflater.from(parent.context)
        val categoryListItemBinding = CategoryListItemBinding.inflate(layoutInflater,parent,false)
        return Holder(categoryListItemBinding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
//        holder.bindCategory(categories[position],context)
        holder.bind(categories[position])
    }

    override fun getItemCount(): Int {
        return categories.count()
    }
    inner class Holder(val binding : CategoryListItemBinding):RecyclerView.ViewHolder(binding.root){
//        val categoryImage = itemView.findViewById<ImageView>(R.id.category_image)
//        val categoryName = itemView.findViewById<TextView>(R.id.category_name)
//        fun bindCategory(category:Category,context:Context){
//            val resourceId =context.resources.getIdentifier(category.image,"drawable",context.packageName)
//            categoryImage.setImageResource(resourceId)
//            categoryName.text = category.
//        }
        fun bind(category : Category){
            binding.category = category
    binding.executePendingBindings()
        }
    }
}