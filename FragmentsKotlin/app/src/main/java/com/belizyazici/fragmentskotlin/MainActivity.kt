package com.belizyazici.fragmentskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ilkFragment(view : View){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction() //işlemi başlatmak

        val firstFragment = BlankFragment()
        fragmentTransaction.replace(R.id.frameLayout, firstFragment).commit() //işlemi sonlandırmak
        // replace de başka fragment açılırken bu fragmenti ekrandan kaldırmak için
    }

    fun secondFragment(view: View){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction() //işlemi başlatmak

        val secondFragment = BlankFragment2()
        fragmentTransaction.replace(R.id.frameLayout, secondFragment).commit() //işlemi sonlandırmak

    }
}