package com.example.calculator111111

import java.lang.NumberFormatException


fun main() {
    var num1: Double? =0.0
    try {
           println("choose first number")
            num1 = readLine()!!.toDouble()
     }
        catch (e: NumberFormatException) {
            println("i think it's not a num")
            println("try again")
            main()
        }



            println("choose operation(+,-,*,/)")
    val operator = readLine()
    val calculator: AbstractOperation =
        when (operator) {
            "+" -> AddOperation()
            "-" -> SubtractOperation()
            "*" -> MultiplyOperation()
            "/" -> DivideOperation()
            else -> {
                println("It's not +-*/ operator")
                println("try again")
                return main()

            }
        }

    var num2: Double? =0.0
    try {
        println("choose second number")
        num2 = readLine()!!.toDouble()
    }
    catch (e: NumberFormatException) {
        println("i think it's not a num")
        println("try again")
        main()
    }

    println("choose operation(+,-,*,/)")
    val nextOperator = readLine()
    val theOtherCalculator: AbstractOperation =
        when (nextOperator) {
            "+" -> AddOperation()
            "-" -> SubtractOperation()
            "*" -> MultiplyOperation()
            "/" -> DivideOperation()
            else -> {
                println("It's not +-*/ operator")
                return
            }
        }
    var num3: Double? =0.0
    try {
        println("choose third number")
        num3 = readLine()!!.toDouble()
    }
    catch (e: NumberFormatException) {
        println("i think it's not a num")
        println("try again")
        main()
    }

    if (num1 == null || num2 == null || num3 == null) {
        println("you didn't write a number")
        return
    }
    try {
        if((operator == "+"||operator =="-") && (nextOperator =="*"|| nextOperator=="/") ){
            val num4 = theOtherCalculator.calculate(
                num2,num3)
            val num5 = calculator.calculate(num1,num4)
            println("result:${num5}")
        }else{
            val num4 = calculator.calculate(num1,num2)
            val result = theOtherCalculator.nextCalculate(num3, num4)
            println("result:${result}")}

    } catch (e: Exception) {
        println("try again")
        main()

    }

    }


