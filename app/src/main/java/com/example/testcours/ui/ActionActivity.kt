package com.example.testcours.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testcours.R

class ActionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action)
    }

    companion object {
        private const val IDENTIFIANT_ID = "IDENTIFIANT_ID"

        fun getStartIntent(context: Context, identifiant: String?): Intent {
            return Intent(context, ActionActivity::class.java).apply {
                putExtra(IDENTIFIANT_ID, identifiant)
            }
        }
    }
    private fun getIdentifiant(): String? {
        return intent.extras?.getString(IDENTIFIANT_ID, null)
    }

}