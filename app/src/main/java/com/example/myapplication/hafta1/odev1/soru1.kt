package com.example.myapplication.hafta1.odev1

import java.util.Scanner
import kotlin.time.measureTimedValue

//Dışarıdan kullanıcı adı ve şifre girişi alınacak, girilen bu kullanıcı
//adı ve şifreyle eşleşip eşleşmeyegi kontrol edilecek
//büyük-küçük harf duyarlılıgı kullanıcı adı için
fun main(){
    val kullaniciAdi= "sule isler"

    val sifre="1234Sule."

    val scanner=Scanner(System.`in`)
    print("Kullanıcı Adınızı Giriniz : ")
    val name= scanner.nextLine()
    print( "Şifrenizi Giriniz : ")
    val password=scanner.nextLine()
    if ((kullaniciAdi.equals(name,ignoreCase = true)) && (sifre.equals(password,ignoreCase = false))){
        println( "HOŞGELDİNİZ.. :)")
    }else
        println( "Kullanıcı adı yada Şifrenizi kontrol edip tekrar deneyiniz. ")


}