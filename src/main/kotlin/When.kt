fun main() {
    val animal = "Dog"

    // Alternative of switch case
    when(animal){
        "Dog" -> println("$animal is animal")
        "Cat" -> println("\"$animal is animal\"")
        else -> println("Not an animal")
    }

    val number = 12

    val result = when(number){
        11 -> "Eleven"
        12 -> "Twelve"
        13 -> "Thirteen"
        in 13..18 -> "Teen"
        else -> "Not in range"
    }

    println(result)
}