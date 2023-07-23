package com.example.myapplication.hafta1.odev2

import java.util.Scanner

// kullanıcıdan yaş istenecek girilen yaşa göre oy kullanıp kullanamayacagını ekrana yazdıran program
fun main(){
    try {
        val scanner=Scanner(System.`in`)
        print( "Yaşınızı Giriniz : ")
        val yas= scanner.nextInt()
        if(yas<=0){
            println( "Geçersiz bir yaş lütfen kontrol ediniz!")
        }
        else if (yas>=18){
            println( "Oy Kullanabilirsiniz.")
        }else{
            println( "Oy Kullanamazsınız.Oy kullanmak için 18 yaşını doldurmanız gerekmektedir.")
        }

    }catch (e:NumberFormatException){

        println( "Hata: Geçersiz bir tamsayı girdiniz.")
    }

}