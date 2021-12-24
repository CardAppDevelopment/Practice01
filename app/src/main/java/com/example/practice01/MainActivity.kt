package com.example.practice01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num=0

        val txtCount=findViewById<TextView>(R.id.txtCount)

        txtCount.text=num.toString()

        findViewById<Button>(R.id.btnTasu).setOnClickListener{
            num+=1
            txtCount.text=num.toString()
            txtCount.textSize=num*1.0f
        }

        findViewById<Button>(R.id.btnHiku).setOnClickListener{
            num-=1
            txtCount.text=num.toString()
            txtCount.textSize=num*1.0f
        }


    }
}