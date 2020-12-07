package com.example.testcours.data

import android.view.View
import android.widget.TextView
import com.afollestad.recyclical.ViewHolder
import com.example.testcours.R

class StringViewHolder(itemView: View) : ViewHolder(itemView) {
    val name: TextView = itemView.findViewById(R.id.title)
}