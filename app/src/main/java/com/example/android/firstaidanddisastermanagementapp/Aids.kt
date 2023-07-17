package com.example.android.firstaidanddisastermanagementapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.widget.Toolbar


class Aids : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aids)

        getSupportActionBar()?.setTitle("AIDS");

        // calling the action bar
        var actionBar = getSupportActionBar()

        // showing the back button in action bar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        }

        //switching to aidsVShiv activity
        val buttonaidsvshiv=findViewById<Button>(R.id.buttonaidsvshiv)
        buttonaidsvshiv.setOnClickListener{
            val Intent= Intent(this,AidsVsHiv::class.java)
            startActivity(Intent)
        }

        //switching to symptoms activity
        val buttonsymptoms=findViewById<Button>(R.id.buttonsymptoms)
        buttonsymptoms.setOnClickListener{
            val Intent= Intent(this,Symptoms::class.java)
            startActivity(Intent)
        }

        //switching to treatment activity
        val buttontreatments=findViewById<Button>(R.id.buttontreatmentaids)
        buttontreatments.setOnClickListener{
            val Intent= Intent(this,TreatmentAids::class.java)
            startActivity(Intent)
        }



    }

}


