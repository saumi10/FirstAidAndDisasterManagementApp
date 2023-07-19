package com.example.android.firstaidanddisastermanagementapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DisasterManagement : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disaster_management)

        getSupportActionBar()?.setTitle("DISASTER MANAGEMENT");

        // calling the action bar
        var actionBar = getSupportActionBar()

        // showing the back button in action bar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        }

        //switching to earthquake activity
        val buttonearth=findViewById<Button>(R.id.buttonEarthquake)
        buttonearth.setOnClickListener{
            val Intent= Intent(this,Earthquake::class.java)
            startActivity(Intent)
        }

        //switching to epidemic activity
        val buttonepidemic=findViewById<Button>(R.id.buttonEpidemic)
        buttonepidemic.setOnClickListener{
            val Intent= Intent(this,Epidemic::class.java)
            startActivity(Intent)
        }

        //switching to floods activity
        val buttonfloods=findViewById<Button>(R.id.buttonFloods)
        buttonfloods.setOnClickListener{
            val Intent= Intent(this,Floods::class.java)
            startActivity(Intent)
        }
        //switching to forest fires activity
        val buttonff=findViewById<Button>(R.id.buttonForestfire)
        buttonff.setOnClickListener{
            val Intent= Intent(this,ForestFires::class.java)
            startActivity(Intent)
        }
    }

}