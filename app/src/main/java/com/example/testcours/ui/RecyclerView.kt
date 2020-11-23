package com.example.testcours.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.afollestad.recyclical.datasource.dataSourceTypedOf
import com.afollestad.recyclical.setup
import com.afollestad.recyclical.withItem
import com.example.testcours.R
import com.example.testcours.StringViewHolder
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
//        my_recycler.adapter = ExempleAdapter(arrayOf("element 1","element2","element3")) { item ->
//            Toast.makeText(this, "Tentative de connexion ${item}", Toast.LENGTH_SHORT).show()
//        }
        val dataSource = dataSourceTypedOf(
            "CLEMENT BESCHU",
            "element2",
            "element3"
        )
        my_recycler.setup {
            withDataSource(dataSource)
            withItem<String, StringViewHolder>(R.layout.item_list) {
                onBind(::StringViewHolder) { _, item ->
                    // PersonViewHolder is `this` here
                    name.text = item
                }
                onClick {
                    // item is a `val` in `this` here
                    Toast.makeText(this@RecyclerView, "Clicked "+item,Toast.LENGTH_SHORT).show()
                }
                onLongClick {
                    // item is a `val` in `this` here
                    Toast.makeText(applicationContext, "long Clicked "+item ,Toast.LENGTH_LONG).show()
                }
            }
        }
    }
    companion object {
        fun getStartIntent(context: Context): Intent {
            return Intent(context, RecyclerView::class.java)
        }
    }
}