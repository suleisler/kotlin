package com.example.myapplication.hafta1.odev4

fun main() {
    var sayac = 11
    do {
        sayac -= 2
    } while (sayac < 10)
    println(sayac)
    var sayac1 = 0
    for (i in 1..10) {
        sayac1++
        for (j in 10..100) {

            break
            println("")

        }
    }
    var sayc=1
    while (sayc <10){
        sayc+=2
        println(sayc)
    }
    var d=10
    when(d){
        10-> println( "a")
        in 1..100-> println( "b")
        !in 1..5-> println( "1-5")
        else -> println( "d")
    }
}