package com.hackton.advalue

import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide

fun ViewGroup.inflate(@LayoutRes layoutRes: Int): View = LayoutInflater
        .from(context).inflate(layoutRes, this, false)

fun ImageView.load(res: Int) {
    Glide.with(this).load(res).into(this)
}