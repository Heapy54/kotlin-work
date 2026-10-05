// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1) {
        println("Error: invalid input")
        exitProcess(1)
    }

    val endpoint = args[0].toInt()

    var total = 0

    for(n in 1.. endpoint step 2){
        total += n
    }

    println("The sum of odd numbers between 1 and $endpoint is $total")
}
