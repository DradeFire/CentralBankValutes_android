package com.example.cb_values_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cb_values_android.fragments.valutes.ListOfValutesFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView, ListOfValutesFragment())
            .commit()
    }
}