package com.example.myfirstkotlinhomework

import kotlin.math.max

class MathematicsOperations {

    fun greatestCommonDivisor(firstNumber:Int, secondNumber:Int): Int {
        var greater = max(firstNumber, secondNumber)
        if (firstNumber == 0 || secondNumber == 0) {
            return greater
        }
        while (greater >= 1) {
            if (firstNumber % greater == 0 && secondNumber % greater == 0) {
                break
            }
            greater--
        }
        return greater

    }

    fun leastCommonMultiple(firstNumber: Int, secondNumber: Int): Int {
        if (firstNumber == 0 || secondNumber == 0) {
            throw IllegalArgumentException("შეიყვანეთ ნულისგან განსხვავებული რიცხვები")
        }
        return (firstNumber * secondNumber) / greatestCommonDivisor(firstNumber, secondNumber)
    }

    fun doesStringContainDollarSign(stringToCheck:String): Boolean {
        return stringToCheck.contains("$")
    }

    fun sumEvenNumbers(n: Int): Int {
        return if(n <= 0){
            0
        } else if (n % 2 == 0) {
            n + sumEvenNumbers(n - 2)
        } else{
            sumEvenNumbers(n - 1)
        }
    }

    fun reverseNumbers(num:Int): Int {
        return num.toString().reversed().toInt()
    }


    fun isPalindrome(isItPalindrome:String): Boolean {
        return isItPalindrome.reversed() == isItPalindrome
    }
}