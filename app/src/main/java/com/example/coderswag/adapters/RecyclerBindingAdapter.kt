package com.example.coderswag.adapters

import android.content.Context
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.coderswag.model.Category
import java.util.*

class RecyclerBindingAdapter {
    companion object {
        @BindingAdapter("android:setImageResource")
        @JvmStatic
        fun setImageResource(view: ImageView, category: Category) {
            val resourceId = view.context.resources.getIdentifier(
                category.image,
                "drawable",
                view.context.packageName
            )
            view.setImageResource(resourceId)
        }
    }
}