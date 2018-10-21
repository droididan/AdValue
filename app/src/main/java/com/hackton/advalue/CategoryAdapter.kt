package com.hackton.advalue

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import kotlinx.android.synthetic.main.category_item.view.*
import kotlin.properties.Delegates

class CategoryAdapter : RecyclerView.Adapter<CategoryAdapter.CategoryHolder>() {

    var categories: List<CategoryModel> by Delegates.observable(arrayListOf()) { _, _, _ ->
        notifyDataSetChanged()
    }

    val selectedList: MutableList<CategoryModel> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, type: Int):
            CategoryAdapter.CategoryHolder = CategoryHolder(parent)

    override fun getItemCount(): Int = categories.size

    override fun onBindViewHolder(viewHolder: CategoryAdapter.CategoryHolder, position: Int) {
        viewHolder.bind(categories[position])
    }

    inner class CategoryHolder(parent: ViewGroup) : RecyclerView.ViewHolder(parent.inflate(R.layout.category_item)) {
        fun bind(model: CategoryModel) = with(itemView) {
            title.text = model.title
            image.load(model.image!!)
            when (model.selected) {
                true -> selected.visibility = View.VISIBLE
                false -> selected.visibility = View.GONE
            }
            itemView.setOnClickListener {

                if (model.selected) {
                    selectedList.remove(model)
                } else {
                    selectedList.add(model)
                }

                model.selected = !model.selected
                notifyDataSetChanged()
            }

        }
    }
}