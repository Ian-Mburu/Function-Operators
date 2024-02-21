fun main() {

    var z = add(57, 87)
    println(z)

    printFullName("Arthur", "Holland")
    var b = getStringLength("Lorem Ipsum")
    println(b)

    var a = getStringLength("Please")
    println(a)

    var y = getStringLength("98898988878787989898989")
    println(y)

    var x = divide(7.0, 2)
    println(x)

    var area = areaOfCircle(21, 3.142)
    println(area)
}


fun add(num1: Int, num2: Int): Int {
    var result = num1 + num2
    return result

}

fun printFullName(firstName: String, lastName: String){
    var fullName = firstName + " " + lastName

    println(fullName)
}

fun getStringLength(word: String): Int {
    var result = word.length
    return result
}

fun divide(num1: Double, num2: Int): Double{
    var result = num1 / num2
    return result
}

//write a function that takes in the diameter of a circle and returns the area of a circle assume PI is 3.142

fun areaOfCircle( num1: Int, num2: Double): Double {
    var result = num1 * num2
    return result
}
