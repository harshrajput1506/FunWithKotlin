fun main() {
    var isRunning = false

    // We can use if else as expression in kotlin
    val message : String = if(isRunning){ "It's Running " } else { "It's not running "}
    println(message)

    val number = 20
    val result = if(number%2==0) "Even" else "Odd"
    println(result)
}