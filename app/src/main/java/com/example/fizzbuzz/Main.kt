package com.example.fizzbuzz

fun main() {
    var notEnteredInteger = true
    var max = 0
    while(notEnteredInteger) {
        try {
            print("Enter maximum integer:")
            max = readLine()!!.toInt()
            notEnteredInteger = false
            if(max <1){
                println("Please enter a maximum greater than 0")
                notEnteredInteger = true
            }
        } catch (e: NumberFormatException) {
            println("Please enter an *integer* maximum")
        }
    }
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