package com.example.android.firstaidanddisastermanagementapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tb : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tb)

        getSupportActionBar()?.setTitle("TUBERCULOSIS");

        // calling the action bar
        var actionBar = getSupportActionBar()

        // showing the back button in action bar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        }

        //switching to PREVENTION activity
        val buttonPrevention=findViewById<Button>(R.id.buttonPrevention)
        buttonPrevention.setOnClickListener{
            val Intent= Intent(this,prevention::class.java)
            startActivity(Intent)
        }

        //switching to screening activity
        val buttonScreening=findViewById<Button>(R.id.buttonScreening)
        buttonScreening.setOnClickListener{
            val Intent= Intent(this,screening::class.java)
            startActivity(Intent)
        }

        //switching to screening activity
        val buttonTreatment=findViewById<Button>(R.id.buttonTreatment)
        buttonTreatment.setOnClickListener{
            val Intent= Intent(this,treatment::class.java)
            startActivity(Intent)
        }
    }
}