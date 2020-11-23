package com.example.testcours

import android.view.View
import android.widget.TextView
import com.afollestad.recyclical.ViewHolder

class StringViewHolder(itemView: View) : ViewHolder(itemView) {
    val name: TextView = itemView.findViewById(R.id.title)
}