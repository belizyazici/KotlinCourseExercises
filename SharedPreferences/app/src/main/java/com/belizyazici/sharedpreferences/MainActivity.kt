package com.belizyazici.sharedpreferences

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var  sharedPreferences: SharedPreferences //sonradan başlatılacak
    var alinanKullaniciAdi : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //kullanıcı adı saklamak için SharedPreferences kullanacağız

        sharedPreferences = this.getSharedPreferences("com.belizyazici.sharedpreferences",
        Context.MODE_PRIVATE) // benim dışımda kimse bu dosyayı kullanamaz demek

        alinanKullaniciAdi = sharedPreferences.getString("kullanici", "") // anahtar kelimeyle veriyi alır

        if (alinanKullaniciAdi != null){
            textView.text = "Kaydedilen Kullanıcı Adı: ${alinanKullaniciAdi}"
        }
    }

    fun kaydet(view: View){

       val kullaniciAdi = editText.text.toString()
        if (kullaniciAdi == ""){
            Toast.makeText(this,"Lütfen bir değer giriniz", Toast.LENGTH_LONG).show()
        }else{
            sharedPreferences.edit().putString("kullanici", kullaniciAdi).apply() //kaydetmek için
            textView.text = "Kaydedilen Kullanıcı Adı: ${kullaniciAdi}"
            // put çalıştırırken başına edit sonuna apply kesinlikle konmalı
        }

    }

    fun sil(view: View){

        alinanKullaniciAdi = sharedPreferences.getString("kullanici", "")

        if (alinanKullaniciAdi != null){
            textView.text = "Kaydedilen Kullanıcı Adı: "
            sharedPreferences.edit().remove("kullanici").apply()
        }

    }
}