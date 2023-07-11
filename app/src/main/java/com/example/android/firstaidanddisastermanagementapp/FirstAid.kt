package com.example.android.firstaidanddisastermanagementapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstAid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid)

        getSupportActionBar()?.setTitle("First Aid");

        // calling the action bar
        var actionBar = getSupportActionBar()

        // showing the back button in action bar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        }


        //switching to cpr activity
        val buttonCPR=findViewById<Button>(R.id.buttonCPR)
        buttonCPR.setOnClickListener{
            val Intent= Intent(this,CPR::class.java)
            startActivity(Intent)
        }

        //switching to shock activity
        val buttonShock=findViewById<Button>(R.id.buttonShock)
        buttonShock.setOnClickListener{
            val Intent= Intent(this,shock::class.java)
            startActivity(Intent)
        }

        //switching to splints activity
        val buttonSplint=findViewById<Button>(R.id.buttonSplints)
        buttonSplint.setOnClickListener{
            val Intent= Intent(this,splints::class.java)
            startActivity(Intent)
        }




    }

}