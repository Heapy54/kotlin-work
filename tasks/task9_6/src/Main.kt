// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    require(args.size == 1)

    try {
        val dataRead = readData(args[0])
        var varianceValue = variance(dataRead)
        println("The variance is $varianceValue")
    }
    catch(error: IllegalArgumentException){
        println("Illegal argument")
    }
}