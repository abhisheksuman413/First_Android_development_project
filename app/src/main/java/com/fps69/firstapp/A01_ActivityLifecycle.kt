package com.fps69.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class A01_ActivityLifecycle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a01_lifecycle)

        val btnLogin:Button = findViewById<Button>(R.id.btn_login)
        val etEmail:EditText = findViewById<EditText>(R.id.et_Email)
        btnLogin.setOnClickListener {
            val emailTxt :String = etEmail.text.toString()
            val intent = Intent(this,A01_ActivityLifecycle1::class.java)
            intent.putExtra("Email ", emailTxt)
            startActivity(intent)
        }


         Log.d("LifeCycle ","OnCreate called of 1St Activity ")
        Toast.makeText(this,"OnCreate 1St Activity", Toast.LENGTH_SHORT).show()

//        finish() >>> Iss method ko agr yha likh dete hai to app open krte ke sath hi close ho jyega
//        becouse of onDestroy() method call ho jyega

    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle ","OnResume called of 1St Activity ")
        Toast.makeText(this,"OnResume 1St Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle ","OnStart called of 1St Activity ")
        Toast.makeText(this,"OnStart 1St Activity", Toast.LENGTH_SHORT).show()


    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle ","OnPause called of 1St Activity ")
        Toast.makeText(this,"OnPause 1St Activity", Toast.LENGTH_SHORT).show()


    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeCycle ","OnRestart called of 1St Activity ")
        Toast.makeText(this,"OnRestart 1St Activity", Toast.LENGTH_SHORT).show()


    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle ","onStop called of 1St Activity ")
        Toast.makeText(this,"onStop 1St Activity", Toast.LENGTH_SHORT).show()


    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle ","OnDestroy called of 1St Activity ")
        Toast.makeText(this,"OnDestroy 1St Activity", Toast.LENGTH_SHORT).show()


    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.d("LifeCycle ","onBackPressed called of 1St Activity ")
        Toast.makeText(this,"onBackPressed 1St Activity", Toast.LENGTH_SHORT).show()

        finish() // Iss method ko jis method ke andr call kr dege uss method ko call hote hi onDestroy() method call ho jyega

    }

}