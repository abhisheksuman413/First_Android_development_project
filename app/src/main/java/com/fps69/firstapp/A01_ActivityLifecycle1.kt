package com.fps69.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class A01_ActivityLifecycle1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a01_lifecycle1)


        val emailTxt1 : String? = intent.getStringExtra("Email")
        val tvEmail:TextView = findViewById<TextView>(R.id.tv_Email)
        tvEmail.text = emailTxt1



        Log.d("LifeCycle ","OnCreate called of 2nd Activity ")
        Toast.makeText(this,"OnCreate 2nd Activity ", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle ","OnStart called of 2nd Activity ")
        Toast.makeText(this,"OnStart 2nd Activity", Toast.LENGTH_SHORT).show()


    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle ","OnResume called of 2nd Activity ")
        Toast.makeText(this,"OnResume 2nd Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle ","OnPause called of 2nd Activity ")
        Toast.makeText(this,"OnPause 2nd Activity", Toast.LENGTH_SHORT).show()


    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeCycle ","OnRestart called of 2nd Activity ")
        Toast.makeText(this,"OnRestart 2nd Activity", Toast.LENGTH_SHORT).show()


    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle ","onStop called of 2nd Activity ")
        Toast.makeText(this,"onStop 2nd Activity", Toast.LENGTH_SHORT).show()


    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle ","OnDestroy called of 2nd Activity ")
        Toast.makeText(this,"OnDestroy 2nd Activity ", Toast.LENGTH_SHORT).show()


    }
}