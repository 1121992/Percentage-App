package com.example.percentage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun per(view: View) {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        val x = PerFragment()
        transaction.replace(R.id.frame, x)
        transaction.commit()

    }
    fun value(view: View) {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        val x = ValueFragment()
        transaction.replace(R.id.frame, x)
        transaction.commit()

    }
    fun diff(view: View) {

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        val x = DiffFragment()
        transaction.replace(R.id.frame, x)
        transaction.commit()
    }

    fun cal(view: View) {




        }
    }



