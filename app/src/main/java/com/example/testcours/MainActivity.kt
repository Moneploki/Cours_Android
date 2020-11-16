package com.example.testcours

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var isvisible = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, getString(R.string.toast_txt), Toast.LENGTH_SHORT).show()
        button_test.setOnClickListener{
            Toast.makeText(this, getString(R.string.txt_toast_button), Toast.LENGTH_SHORT).show()
        }
        image_settings.setOnClickListener {
            val targatIntent = Intent().apply{
                action = android.provider.Settings.ACTION_SETTINGS
            }
            startActivity(targatIntent);
        }
        linkdin.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/cl%C3%A9ment-beschu-963115172/?originalSubdomain=fr")));
        }
        adresse.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("geo:47.506991, -0.594363")));
        }
        image_clement_mignon.setOnClickListener {
            startActivity(RecyclerView.getStartIntent(this));
        }
    }

    companion object {
        fun getStartIntent(context: Context): Intent {
            return Intent(context, MainActivity::class.java)
        }
    }
}
