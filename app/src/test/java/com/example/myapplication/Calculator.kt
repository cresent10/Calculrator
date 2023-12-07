package com.example.myapplication

class Calculator {
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Double, b: Double): Double {
        if (b != 0.0) {
            return a / b
        } else {
            throw IllegalArgumentException("Cannot divide by zero.")
        }
    }
}

fun main() {
    val calculator = Calculator()

    // 더하기
    val sum = calculator.add(4.0, 1.0)
    println("더하기: $sum")

    // 빼기
    val difference = calculator.subtract(4.0, 1.0)
    println("빼기: $difference")

    // 곱하기
    val product = calculator.multiply(4.0, 1.0)
    println("곱하기: $product")

    // 나누기
    try {
        val quotient = calculator.divide(4.0, 1.0)
        println("나누기: $quotient")
    } catch (e: IllegalArgumentException) {
        println("오류: ${e.message}")
    }
}
