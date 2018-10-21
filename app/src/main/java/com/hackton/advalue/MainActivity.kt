package com.hackton.advalue

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

     private lateinit var adapter : CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setRecyclerView()
    }

    private fun setRecyclerView() {
        adapter = CategoryAdapter()
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        adapter.categories = categoriesList
        recyclerView.adapter = adapter
    }
}
