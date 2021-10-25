
fun main() {
    val numbers = mutableListOf("one", "two", "three")
    val firstAndLast = with(numbers) {
        "The first element is ${first()}," +
                " the last element is ${last()}"
    }
    println("Changes!")
    println("Test changes 9999!")
    println(firstAndLast)
}

