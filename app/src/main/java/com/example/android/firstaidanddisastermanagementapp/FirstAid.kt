package com.example.android.firstaidanddisastermanagementapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstAid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid)

        getSupportActionBar()?.setTitle("FIRST AID");

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

        //switching to choking activity
        val buttonchoking=findViewById<Button>(R.id.buttonchoking)
        buttonchoking.setOnClickListener{
            val Intent= Intent(this,choking::class.java)
            startActivity(Intent)
        }

        //switching to burns activity
        val buttonburns=findViewById<Button>(R.id.buttonBurns)
        buttonburns.setOnClickListener{
            val Intent= Intent(this,burns::class.java)
            startActivity(Intent)
        }

        //switching to seizures activity
        val buttonseizures=findViewById<Button>(R.id.buttonseizures)
        buttonseizures.setOnClickListener{
            val Intent= Intent(this,seizures::class.java)
            startActivity(Intent)
        }







    }

}