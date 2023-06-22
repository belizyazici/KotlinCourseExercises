package com.belizyazici.firstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Merhaba Kotlin")

        //Variables
        var a = 5
        var b = 10

        //sabitler-values
        val pi = 3.14

        //tanımlama-defining
        val myinteger : Int

        myinteger = 5

        var mylong : Long = 100
        mylong = 30000000

        val ornekdizi = arrayOf(7,8,9,9,9,8,10)
        println("index 2: ${ornekdizi[2]}") // metin içine yazdırmak için dolar işareti kullanılır

        val benimSet = setOf<Int>(7,8,9,9,9,8,10)
        println(benimSet.size) // sayı tekrarlarını göstermez, output: 4

        //for each
        benimSet.forEach {
            println(it) //output: 7-8-9-10
        }
        // when if-else yerine kullanılabilir
        var notRakami = 3
        var notStringi = ""

        when(notRakami){ // buraya kontrol edilmek istenen değişken girilir
            0 -> notStringi ="Gecersiz not"
            1 -> notStringi ="zayıf"
            2 -> notStringi ="kötü"
            3 -> notStringi ="orta"
            4 -> notStringi ="iyi"
            else -> notStringi ="pek iyi"

        }
        println(notStringi)
        ilkFonksiyon()

        var benimYasim : Int? = null

        // null safety için ikinci yöntem
        if (benimYasim != null)
            println(benimYasim*2)
        else
            println("Null geldi")

        // !! -> null olmayacak eminim demek, ? -> null olabilir demek
        println(benimYasim!!.minus(2))

        // null safety için üçüncü yöntem - elvis operatörü
        val sonuc = benimYasim?.minus(2) ?: 10 //eğer null gelirse 10 yazdır gelmezse soldaki işlemi yap

        // null safety için dördüncü yöntem - let
        benimYasim = 5
        benimYasim?.let {
            println(it * 5)
        }

    }
    fun ilkFonksiyon(){
        println("İlk fonsiyon çalıştırıldı")
    }
}
