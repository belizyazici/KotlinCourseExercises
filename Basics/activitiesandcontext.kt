package com.belizyazici.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Toast, Alert

        //applicationContext -> app context
        //this, this@MainActivity -> aktivitenin contexti

        Toast.makeText(this, "Welcome!", Toast.LENGTH_LONG).show()// ekranda ne kadar süre gösterilecek - kısa mesajlar için
    }
    /*
    fun mesajGoster(view: View){
        val uyariMesaji = AlertDialog.Builder(applicationContext) //ya da this@MainActivity yaz netlik için
        uyariMesaji.setTitle("Şifre Hatası")
        uyariMesaji.setMessage("Şifreyi girmediniz, tekrar denemek ister misiniz?")

        //Lambda gösterimi
        uyariMesaji.setPositiveButton("Evet", DialogInterface.OnClickListener { dialogInterface, i ->,
            Toast.makeText(this, "Baştan deniyorsunuz", Toast.LENGTH_LONG).show()
        })//olumlu olan butonu daha güzel, olumlu gösterir

        uyariMesaji.setNegativeButton("Hayır") { dialogInterface, i -> Toast.makeText(this, "Hayırı seçtiniz, deneyemiyorsunuz", Toast.LENGTH_LONG).show()
        }

        uyariMesaji.show() // bunu yazmak zorundasın yoksa göstermez

    }
    */
    fun changeActivity(view : View){
       // val userData = textEdit.text.toString

        val intent = Intent(applicationContext, SecondActivity::class.java) // butona basıldığında hangi sayfaya gidilmek istendiği yazılır
        //intent.putExtra("yollananVeri", userData)
        startActivity(intent) // bu satırla da çalıştırılır

    }
}
