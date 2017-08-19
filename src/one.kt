/*
    Some simple basics for memory:
    fun main is the primary function to run
    declarations do not have to be in any real order
    if statements can be a variable, or val assignment...because why not?
    var is identified by type at compile time, val is immutable, but also determined
    at compile time.
    switches are when now
    while logic and for logic is the same as Java
    ++ and -- operators are used, unlike Python
 */

fun main(args: Array<String>) {
    /*
    buildArray()
    println("Hello World.")
    println(text)
    println("The larger of the two is " + max)
    println(fullName)
    printArray()
    printList()
    printSet()
    printHashMap()
    */

    var m = 5
    println(m)
    m = m + 1
    println(m)
    m++
    println(m)
    m--
    println(m)

    var n = 4

    while (m >= n){
        println(n > m)
        n++
        if (n > m)
            println("the number ${n} is greater than ${m} now")

    }

    val day = 1
    var dayName = " "

    when (day) {
        1 -> dayName = "Monday"
        2 -> dayName = "Tuesday"
        3 -> dayName = "Wednesday"
        4 -> dayName = "Thursday"
        5 -> dayName = "Friday"
        else -> dayName = "Weekend"

    }

    println(dayName)

}

fun buildArray() {
    // builds an array with values of 0, 1, 4, 9, and 16...somehow
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

// Wut?
val max = if(x > y) x else y


val firstName = "James"
val lastName = "Hatfield"

val fullName = firstName + " " + lastName

//Arrays

val anArray = arrayOfNulls<String>(4)

fun printArray() {
    anArray[0] = "James\n"
    anArray[1] = "Jeff\n"
    anArray[2] = "Nina\n"
    anArray[3] = "Andrew\n"
    anArray.set(3, "John")
    for (entry in anArray)
        print(entry)
}

// Lists (changeable size)

val newList = ArrayList<Int>()

fun printList() {
    newList.add(3)
    newList.add(3)
    newList.add(5)
    newList.add(98)
    newList.add(-1)
    newList.add(986364827)
    for (num in newList)
        println(num)
}

// Sets

val newSet = HashSet<Int>()

fun printSet() {
    newSet.add(1)
    newSet.add(1)
    newSet.add(2)
    newSet.add(798475982)
    println(newSet.size)
}

// Maps

val newHashMap = HashMap<Int, String>()

fun printHashMap() {
    newHashMap.put(0, "One")
    newHashMap.put(1, "Two")
    newHashMap.put(2, "Three")
    for (key in newHashMap)
        println(key)
}