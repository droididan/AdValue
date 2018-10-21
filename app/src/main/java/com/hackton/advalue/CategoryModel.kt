package com.hackton.advalue

data class CategoryModel(val title: String? = null, val image: Int? = null, var selected: Boolean = false)

val categoriesList = arrayListOf<CategoryModel>().apply {
    add(CategoryModel("Automotive", R.drawable.ic_automotive))
    add(CategoryModel("Business", R.drawable.ic_bussiness))
    add(CategoryModel("Cleaning", R.drawable.ic_cleaning))
    add(CategoryModel("Health", R.drawable.ic_health))
    add(CategoryModel("Food & Drinks", R.drawable.ic_food_drink))
    add(CategoryModel("Diet & Fitness", R.drawable.ic_diet_fitness))

}