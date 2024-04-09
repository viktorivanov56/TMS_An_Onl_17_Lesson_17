package com.example.dz17_victor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class Activity_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val btnGoToSecAct2 = findViewById<Button>(R.id.btnGoToSecAct2)

        val oclBtnGoToSecAct2 = View.OnClickListener {
            val intent = Intent(this@Activity_2, Activity_3::class.java)
            startActivity(intent)
        }

        btnGoToSecAct2.setOnClickListener(oclBtnGoToSecAct2)

        findViewById<ImageView>(R.id.arrow_back).setOnClickListener {
            finish()
        }

    }
}