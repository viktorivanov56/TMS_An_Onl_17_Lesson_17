package com.example.dz17_victor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class Activity_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        val btnGoToSecAct3 = findViewById<Button>(R.id.btnGoToSecAct3)

        val oclBtnGoToSecAct3 = View.OnClickListener {
            val intent = Intent(this@Activity_3, Activity_4::class.java)
            startActivity(intent)
        }

        btnGoToSecAct3.setOnClickListener(oclBtnGoToSecAct3)

        findViewById<ImageView>(R.id.arrow_back).setOnClickListener {
            finish()
        }
    }
}