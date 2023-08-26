// Variables in Kotlin
// Two Types - Var & Val

fun main(){
    var score = 5
    val message = "Hey!"
    // message = "Hey! Update" (We can't change values in val variables)
    println(score)
    println(message)
    score = 10 // But we can change values in var variables
    // score = 3.14 (We can't assign float value in already assigned int variable)
    println(score)

    // Explicit Defined Variables

    var age : Int = 20
    var name : String = "Harsh"
    println("$name $age")

}