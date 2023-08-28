fun main() {
    for (i in 1..5 ) println(i)
    println("Until")
    for (i in -2 until 10) println(i)
    println("Steps")
    for (i in 1..10 step 2) println(i)
    println("Down to")
    for (i in 10 downTo -3) println(i)
}