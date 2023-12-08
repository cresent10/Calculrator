package com.example.calculrator.calc

import com.example.calculrator.abs.AbstractOperation

class DivideOperation : AbstractOperation() {
    @Throws(ArithmeticException::class)
    override fun operate(num1: Int, num2: Int): Double {
        require(value:num2 != 0) {
            ArithmeticException( "Divide by zero")
        }
        return (num1 / num2).toDouble()
    }
}