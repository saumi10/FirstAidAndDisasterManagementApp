package com.example.android.firstaidanddisastermanagementapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {

    lateinit var drawerLayout: DrawerLayout
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_Layout)
        actionBarDrawerToggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)

        // pass the Open and Close toggle for the drawer layout listener
        // to toggle the button
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        // to make the Navigation drawer icon always appear on the action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        getSupportActionBar()?.setTitle("");



        //first aid
        val button1=findViewById<Button>(R.id.button1)
        button1.setOnClickListener{
            val Intent= Intent(this,FirstAid::class.java)
            startActivity(Intent)
        }

        //disaster_management
        val button2=findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            val Intent= Intent(this,DisasterManagement::class.java)
            startActivity(Intent)
        }

        //drugs
        val button3=findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            val Intent= Intent(this,Drugs::class.java)
            startActivity(Intent)
        }

        //switching to aids activity
        val button4=findViewById<Button>(R.id.button4)
        button4.setOnClickListener{
            val Intent= Intent(this,Aids::class.java)
            startActivity(Intent)
        }

        //basic sanitation
        val button5=findViewById<Button>(R.id.button5)
        button5.setOnClickListener{
            val Intent= Intent(this,BasicSanitation::class.java)
            startActivity(Intent)
        }

        //TB
        val button6=findViewById<Button>(R.id.button6)
        button6.setOnClickListener{
            val Intent= Intent(this,Tb::class.java)
            startActivity(Intent)
        }

        //Social media redirecting buttons

            //instagram
        val buttonInstagram=findViewById<Button>(R.id.buttonInsta)
        buttonInstagram.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ircskarnataka/?hl=en"))
            startActivity(i)
        }

            //facebook
        val buttonFacebook=findViewById<Button>(R.id.buttonFacebook)
        buttonFacebook.setOnClickListener{
            val j = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ircskarnataka/"))
            startActivity(j)
        }

            //twitter
        val buttonTwitter=findViewById<Button>(R.id.buttonTwitter)
        buttonTwitter.setOnClickListener{
            val k = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/ircskarnataka?lang=en"))
            startActivity(k)
        }











    }


    // override the onOptionsItemSelected()
    // function to implement
    // the item click listener callback
    // to open and close the navigation
    // drawer when the icon is clicked
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }
}
