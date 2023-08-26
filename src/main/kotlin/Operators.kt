fun main() {
    //Arithmetic Operators -> +,*,/
    var a = 13
    var b = 2
    var i = 19.8
    var j = 2.5

    println(a+b) // 15
    println(a-b) // 11
    println(a*b) // 26
    println(a/b) // 6 -> it return int value because we have 2 int values
    println(i*b) // 39.6 -> return float value because one operand is float
    println(i*j) // 49.5 -> return float value because both operands are float
    println(i/b) // 9.9
    println(i/j) // 7.92

    //Conversion
    println((a/b).toFloat()) // int to float -> 6.0
    println(i.toInt()) // float to int -> 19

    //Modulus Operator (%)
    println(a%b) // 1 -> It gives reminder

    // Relational Operators -> <,>,<=,>=,==,!=
    println(a>b) // true
    println(a<b) // false
    println(a==b) // false
    println(a>=b) // true
    println(a<=b) // false
    println(a!=b) // false

    // Post Increment and Pre Increment

    a++
    println(a) // 14
    println(a++) // 14
    println(a) // 15
    println(++a) // 16

    //Similar goes with a-- and --a

    // Logical Operators

    // && AND --> if one statement is false then the result is false otherwise it's true
    // || OR --> if one statement is true then it shows true otherwise false

    val isAdult = true
    val isJob = false
    val isMature = true
    val isHaveGf = false

    println(isAdult && isJob) //false
    println(isAdult && isMature) //true
    println(isAdult || isJob) //true
    println(isHaveGf || isJob) //false
    println(isAdult || isHaveGf) //true

    // ! NOT --> it opposite the result true -> false | false -> true
    println(!isHaveGf) //true
    println(!isAdult) //false

    //Short Circuiting
    // --> In && if first statement is false then it's not check or execute second statement
    // --> In || if first statement is true then it's not check or execute second statement

    // a = 16 & b = 2
    var short = a == 13 && b++ == 2
    println(short) // false
    println("a - $a b - $b")

    short = a == 16 && b++ == 2
    println(short) // true
    println("a - $a b - $b")

    short = a == 16 && b++ == 4  // b = 3
    println(short) //false


}