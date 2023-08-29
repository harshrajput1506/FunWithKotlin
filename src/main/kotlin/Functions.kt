fun main() {
    println(add(3,2))
    println(add2(3,2))
    println(add(num2 = 5, num1 =  20)) // Named Arguments
    loop(10)
    val fn1 = ::add
    val fn: (num1: Int, num2: Int) -> Int = ::add // Explicit Data Type
    println("Variable function " + fn(5,7).toString())
}

// Function with return statement
fun add(num1 : Int, num2 : Int) : Int{
    val result = num1+num2
    return result
}
// Simple code for one line return code
fun add2(num1 : Int, num2: Int) = num1+num2 //it is also return int value

//Default arguments
fun loop(count : Int = 5){
    for (i in 1..count){
        println(i)
    }
}

