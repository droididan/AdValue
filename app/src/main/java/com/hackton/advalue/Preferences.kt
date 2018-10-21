package com.hackton.advalue

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_preferences.*

class Preferences : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.anim_left_right, R.anim.anim_right_left)
        setContentView(R.layout.activity_preferences)
        finish.animate().setDuration(200).translationY(0f).start()
    }
}
