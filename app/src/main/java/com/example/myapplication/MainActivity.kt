package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val summitBtn=findViewById<Button>(R.id.summit_btn)
        val nameText=findViewById<EditText>(R.id.name_text)
        val ageText=findViewById<EditText>(R.id.age_text)


        summitBtn.setOnClickListener{
            Log.d("moms", nameText.text.toString())
            Log.d("moms", ageText.text.toString())
            val mess="Hello ${nameText.text} , age : ${ageText.text} \nGo corona go."
            Toast.makeText(this,mess,Toast.LENGTH_LONG).show()
        }
    }

}