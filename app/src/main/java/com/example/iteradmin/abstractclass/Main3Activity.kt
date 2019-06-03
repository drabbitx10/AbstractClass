package com.example.iteradmin.abstractclass

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class Main3Activity : BaseActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun getItemId(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getContentView():Int{
        return R.layout.activity_main3
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.first_icon -> {
                startActivity(Intent(this, MainActivity::class.java))
                return true
            }
            R.id.second_icon -> {
                startActivity(Intent(this, Main2Activity::class.java))
                return true

            }
            R.id.third_icon -> {

                startActivity(Intent(this, Main3Activity::class.java))
                return true
            }
        }

        return false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val btnv = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        btnv.setOnNavigationItemSelectedListener(this)
    }
}

