package com.example.fizzbuzz

fun main() {
    val range = 1..100
    for (number in range){
        if ((number % 15) == 0) {
            print("FizzBuzz ");
        } else {
            if ((number % 5) == 0){
                print("Buzz ");
            } else {
                if (number % 3 == 0) {
                    print("Fizz ")
                } else {
                    print("$number ")
                }
            }
        }
    }
}