package com.example.fizzbuzz

fun main() {
    val range = 1..100
    for (number in range){
        var output = ""
        if (number % 3 == 0){
            output += "Fizz"
        }
        if (number % 5 == 0){
            output += "Buzz"
        }
        if (number % 7 == 0){
            output += "Bang"
        }
        if (output.isEmpty()){
            output = number.toString()
        }
        print(output + "\n")
    }
}