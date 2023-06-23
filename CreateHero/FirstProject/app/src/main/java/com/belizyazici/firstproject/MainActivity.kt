package com.belizyazici.firstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var name = "" // Scope
    private var age : Int? = null
    private var job = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createHero(view : View){
        name = nameText.text.toString()
        age = ageText.text.toString().toIntOrNull()
        job = jobText.text.toString()

        if (age == null)
            resultText.text = "Enter the age correctly"
        else {
            val hero = Hero(name, age!!, job)

            resultText.text = "Name: ${hero.name} Age: ${hero.age} Job: ${hero.job}"
        }
    }
}