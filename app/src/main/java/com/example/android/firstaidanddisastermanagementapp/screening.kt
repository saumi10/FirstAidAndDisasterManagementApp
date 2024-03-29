package com.example.android.firstaidanddisastermanagementapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class screening : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screening)

        //to change title of action bar of respective activity
        getSupportActionBar()?.setTitle("TB SCREENING");

        //to show back button on action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    //function to make back button work
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
