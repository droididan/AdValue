package com.hackton.advalue

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var adapter: CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setRecyclerView()
        onClickListeners()
    }

    private fun onClickListeners() {
        next.setOnClickListener { startActivity(Intent(this, Preferences::class.java)) }

    }

    private fun setRecyclerView() {
        adapter = CategoryAdapter{ amount ->
            when (amount) {
                0 -> next.animate().setDuration(200).translationY(300f).start()
                else -> next.animate().setDuration(200).translationY(0f).start()
            }
        }


        recyclerView.layoutManager = GridLayoutManager(this, 2)

        adapter.categories = categoriesList

        recyclerView.adapter = adapter
        runLayoutAnimation()

    }

    private fun runLayoutAnimation() {
        val controller = AnimationUtils.loadLayoutAnimation(this, R.anim.grid_layout_animation_from_bottom)
        recyclerView.layoutAnimation = controller
        recyclerView.adapter?.notifyDataSetChanged()
        recyclerView.scheduleLayoutAnimation()
    }
}
