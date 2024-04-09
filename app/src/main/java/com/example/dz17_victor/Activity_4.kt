package com.example.dz17_victor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class Activity_4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
        val btnGoToMainAct = findViewById<Button>(R.id.btnToMainAct)

        val oclBtnGoToMainAct = View.OnClickListener {
            val intent = Intent(this@Activity_4, MainActivity::class.java)
            startActivity(intent)
        }

        btnGoToMainAct.setOnClickListener(oclBtnGoToMainAct)

        findViewById<ImageView>(R.id.arrow_back).setOnClickListener {
            finish()
        }
    }
}