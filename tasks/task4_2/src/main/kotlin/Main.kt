// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    println("Pizza Options : ")
    println("a")
    println("b")
    println("c")
    println("d")

    //read the input
    val response = readln().lowercase()

    if ((response.length == 1) && (response[0] in 'a'..'d')){
        println("Order accepted")
    }
    else {
        println("Invalid Choice")
    }
}
