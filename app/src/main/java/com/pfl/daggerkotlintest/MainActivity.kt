package com.pfl.daggerkotlintest

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pfl.daggerkotlintest.databinding.ActivityMainBinding
import com.pfl.frameworks.AppComponent
import com.pfl.frameworks.DaggerAppComponent


class MainApp : Application() {
    //lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        //appComponent = DaggerAppComponent.create()

    }
}

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val LOG_TAG = "Main Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.buttonTest1.setOnClickListener {
            val appComponent: AppComponent = DaggerAppComponent.create()
            //val person: Person = AppComponent.person
            //println(appComponent.person)
            Log.d(LOG_TAG, appComponent.person.toString())
        }
    }
}