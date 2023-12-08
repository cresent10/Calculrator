package com.example.calculrator

import com.example.calculrator.calc.AddOperation
import com.example.calculrator.calc.Calculator
import com.example.calculrator.calc.DivideOperation
import com.example.calculrator.calc.MultipiyOperation
import com.example.calculrator.calc.SubstractOperation

class Calculator () {
    fun operate() {

    }
}

fun main() {
    // 더하기
    val addCalc = Calculator(AddOperation())
    println("10더하기 20 결과는 : ${addCalc.operate(num1: 10, num2: 20)} 입니다")
    // 빼기
    val subCalc = Calculator(SubstractOperation())
    println("10빼기 20 결과는 : ${subCalc.operate(num1: 10, num2: 20)} 입니다")
    // 곱하기
    val mulCalc = Calculator(MultiplyOperation())
    println("10곱하기 20 결과는 : ${mulCalc.operate(num1: 10, num2: 20)} 입니다")
    // 나누기
    val divCalc = Calculator(DivideOperation())
    println("30 나누기 20 결과는 : ${divCalc.operate(num1: 30, num2: 20)} 입니다")
}