package com.example.fizzbuzz

fun main() {
    print("Enter maximum integer:")
    val max = readLine()!!.toInt()
    val range = 1..max
    print("Enter rules as space separated list:")
    val rules = readLine()!!.split(" ")

    for (number in range){
        val output = mutableListOf<String>()
        if (number % 3 == 0 && ("3" in rules)){
            output.add("Fizz")
        }
        if (number % 13 == 0 && ("13" in rules)){
            output.add("Fezz")
        }
        if (number % 5 == 0 && ("5" in rules)){
            output.add("Buzz")
        }
        if (number % 7 == 0 && ("7" in rules)){
            output.add("Bang")
        }
        if (number % 11 == 0 && ("11" in rules)) {
            output.retainAll{ it == "Fezz" }
            output.add("Bong")
        }
        if (number % 17 == 0 && ("17" in rules)){
            output.reverse()
        }
        if (output.isEmpty()){
            output.add(number.toString())
        }

        print(output.joinToString("") + "\n")

    }
}