package com.example.testcours

import ExempleAdapter
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        my_recycler.adapter = ExempleAdapter(arrayOf("element 1","element2","element3")) { item ->
            Toast.makeText(this, "Tentative de connexion ${item}", Toast.LENGTH_SHORT).show()
        }
    }
    companion object {
        fun getStartIntent(context: Context): Intent {
            return Intent(context, RecyclerView::class.java)
        }
    }
}