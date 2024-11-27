package com.example.myfirstkotlinhomework

fun main(){
    while (true){
        println("შეიყვანეთ x:")
        val x: String = readLine().toString()

        println("შეიყვანეთ y:")
        val y: String = readLine().toString()

        numberDivisionAndPrint(extractNumbersOnly(x),extractNumbersOnly(y))

        var answer: String
        do {
            println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")
            answer = readLine().toString().uppercase()
            if  (answer != "Y" && answer != "N"){
                println("შეიყვანეთ მხოლოდ Y ან N!")
            }
        } while (answer != "Y" && answer != "N")

        if (answer == "N") {
            println("დასასრული.")
            break
        }

    }

}

fun numberDivisionAndPrint(num1:Double, num2:Double){
    if (num2 == 0.0){
        println("ნულზე გაყოფა არ შეიძლება! Y პარამეტრი უნდა შეიცავდეს ციფრებს და არ უნდა იყოს ნულის ტოლი!")
    }
    else  {
        val z:Double = num1 / num2
        println("X და Y განაყოფი არის: $z")
    }
}

fun extractNumbersOnly(stringToNumbers :String ): Double {
    return stringToNumbers.filter{it.isDigit()}.ifEmpty {"0"}.toDouble()
}