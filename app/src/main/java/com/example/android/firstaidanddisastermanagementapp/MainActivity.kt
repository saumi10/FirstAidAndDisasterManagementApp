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
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

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

        //bottom navigation bar functionality code
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.bottomInfo -> {
                    // Handle click for item 1
                    val bottominfobutton = Intent(Intent.ACTION_VIEW, Uri.parse("https://redcrosskarnataka.org/history-of-ircs/"))
                    startActivity(bottominfobutton)
                    true
                }

                R.id.bottomHelpline -> {
                    // Handle click for "Helpline" item
                    dialPhoneNumber("8022268435")
                    true
                }

                else -> false
            }
        }

        //top navigation drawer  menu items functionality code
        val navigationView = findViewById<NavigationView>(R.id.navigationView)

        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.website -> {
                    val sideDrawerWebsite = Intent(Intent.ACTION_VIEW, Uri.parse("https://redcrosskarnataka.org/"))
                    startActivity(sideDrawerWebsite)

                    true
                }
                R.id.becomeABloodDonor -> {
                    val sideDrawerBloodDonor = Intent(Intent.ACTION_VIEW, Uri.parse("https://redcrosskarnataka.org/become-a-blood-donor/"))
                    startActivity(sideDrawerBloodDonor)

                    true
                }

                R.id.contactUs -> {
                    val sideDrawerContactUs = Intent(Intent.ACTION_VIEW, Uri.parse("https://redcrosskarnataka.org/contact-us/"))
                    startActivity(sideDrawerContactUs)

                    true
                }

                R.id.firstaidregistration -> {
                    val sideDrawerfirstAidRegistration = Intent(Intent.ACTION_VIEW, Uri.parse("https://redcrosskarnataka.org/first-aid-training/"))
                    startActivity(sideDrawerfirstAidRegistration)

                    true
                }
                R.id.schoolRegistration-> {
                    val sideDrawerschoolRegn = Intent(Intent.ACTION_VIEW, Uri.parse("https://redcrosskarnataka.org/application/public/"))
                    startActivity(sideDrawerschoolRegn)

                    true
                }
                R.id.puCollegeRegistration-> {
                    val sideDrawerpuCollegeRegn = Intent(Intent.ACTION_VIEW, Uri.parse("https://redcrosskarnataka.org/application/public/college-registration-form"))
                    startActivity(sideDrawerpuCollegeRegn)

                    true
                }

                R.id.chatWithUs-> {
                    val sideDrawerchat = Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=919353743508&text=Hi,%20I%20contacted%20you%20through%20your%20app."))
                    startActivity(sideDrawerchat)

                    true
                }

                R.id.jrc-> {
                    val sideDrawerjrc = Intent(Intent.ACTION_VIEW, Uri.parse("https://redcrosskarnataka.org/junior-red-cross/"))
                    startActivity(sideDrawerjrc)

                    true
                }

                R.id.yrc-> {
                    val sideDraweryrc = Intent(Intent.ACTION_VIEW, Uri.parse("https://redcrosskarnataka.org/youth-red-cross/"))
                    startActivity(sideDraweryrc)

                    true
                }




                else -> false
            }
        }



    }
//phone intent
    private fun dialPhoneNumber(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:$phoneNumber")
        }
        startActivity(intent)
    }

//when app is resumed after redirecting to web pages
    override fun onResume() {
        super.onResume()
        // Set the home menu item as selected
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.menu.findItem(R.id.bottomHome).isChecked = true

        val navigationView = findViewById<NavigationView>(R.id.navigationView)
        navigationView.menu.findItem(R.id.sideHome).isChecked = true
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
