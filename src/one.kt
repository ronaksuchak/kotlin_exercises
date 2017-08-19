fun main(args: Array<String>) {
    buildArray()
    println("Hello World.")
    println(text)
    println("The larger of the two is " + max)
}

fun buildArray() {
    // builds an array with values of 0, 1, 4, 9, and 16
    val asc = Array(5, { i -> (i * i).toString() })
    for (a in asc) println(a)
}

val text ="""
        |This is some basic multi-line text
        |Line two for illustration purposes
        |and the trimMargin() function should clean it all up
        """.trimMargin()

var x = 20
var y = 7

val max = if(x > y) x else y


