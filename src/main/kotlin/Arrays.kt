fun main() {
    val arr = arrayOf("One", "Two", "Three")
    val arr1 = intArrayOf(1,2,3)
    println(arr.toString())
    for (i in arr ) println(i)
    for ((i, e) in arr.withIndex()) println("$i $e")

    println(arr1[0]+3)
    println(arr[0])
    arr[2] = "Four"
    println(arr)

    val arrList = arrayListOf<String>()
    arrList.add("String")
    println(arrList[0])
}