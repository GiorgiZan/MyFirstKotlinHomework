package com.example.myfirstkotlinhomework

fun main() {
   val mathematicsOperations:MathematicsOperations = MathematicsOperations()
   println("ასამდე ლუწი რიცხვების ჯამი: " + mathematicsOperations.sumEvenNumbers(100))

   println(mathematicsOperations.reverseNumbers(10220))

   println(mathematicsOperations.isPalindrome("ana"))

   println("სიტყვა დოლარის გარეშე: " + mathematicsOperations.doesStringContainDollarSign("Hello, world!"))
   println("სიტყვა დოლარით : " + mathematicsOperations.doesStringContainDollarSign("Price is 5$"))

   println("უდიდესი საერთო გამყოფი: " + mathematicsOperations.greatestCommonDivisor(27,18))

   println("უმცირესი საერთო ჯერადი: " +mathematicsOperations.leastCommonMultiple(6,4))
}
