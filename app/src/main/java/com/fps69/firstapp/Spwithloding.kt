package com.fps69.firstapp

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Contacts.Intents

class Spwithloding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spwithloding)

        startHeavyTask()


    }
    private fun startHeavyTask(){ // Creating startHeavyTask function
        LongOperation().execute()
    }


    private open  inner class LongOperation: AsyncTask<String?,Void?,String?>(){ // Creating LongOperation class
                                                                                // Class inherit krne ke liye open kr diye hai
                                                                               // Inner likhe hai because ye inner class hai
        override fun doInBackground(vararg p0: String?): String? {
            for(i in 0..6){
                try{
                    Thread.sleep(1000)
                }
                catch (e:Exception){
                    Thread.interrupted()
                }
            }
            return "Result"
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)

            startActivity(Intent(this@Spwithloding,Webview::class.java))
        }


    }


}