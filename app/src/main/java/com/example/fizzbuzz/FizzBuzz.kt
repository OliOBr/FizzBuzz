package com.example.fizzbuzz

fun main() {
    val range = 1..300
    for (number in range){
        val output = mutableListOf<String>()
        if (number % 3 == 0){
            output.add("Fizz")
        }
        if (number % 13 == 0){
            output.add("Fezz")
        }
        if (number % 5 == 0){
            output.add("Buzz")
        }
        if (number % 7 == 0){
            output.add("Bang")
        }
        if (number % 11 == 0) {
            output.retainAll{ it == "Fezz" }
            output.add("Bong")
        }
        if (number % 17 == 0){
            output.reverse()
        }
        if (output.isEmpty()){
            output.add(number.toString())
        }

        print(output.joinToString("") + "\n")
    }
}