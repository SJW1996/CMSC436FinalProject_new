package com.example.rankmystore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast
import android.view.View.OnClickListener


class register : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
        var login_button = findViewById<View>(R.id.tvlogin) as Button
        login_button.setOnClickListener({goto_Loginactivity()})



    }
    fun goto_Loginactivity(){
        val intent = Intent(this, login::class.java)
        startActivity(intent)
    }
}