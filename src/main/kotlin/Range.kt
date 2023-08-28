fun main() {
    var number = 5
    val result = number in 1..5 // it includes 1,2,3,4,5
    println(result) //true

    val result1 = number in 1 until 5 // it includes 1,2,3,4
    println(result1)  //false
}