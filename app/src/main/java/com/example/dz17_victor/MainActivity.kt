package com.example.dz17_victor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnGoToSecAct = findViewById<Button>(R.id.btnGoToSecAct)

        val oclBtnGoToSecAct = View.OnClickListener {
            val intent = Intent(this@MainActivity, Activity_2::class.java)
            startActivity(intent)
        }

        btnGoToSecAct.setOnClickListener(oclBtnGoToSecAct)
    }
}