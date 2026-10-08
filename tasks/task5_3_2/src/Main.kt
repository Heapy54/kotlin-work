// Task 5.3.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
        if (args.size != 2) {
        println("Error: invalid input")
        exitProcess(1)
    }
    rollDie(args[0].toInt(),args[1].toInt())
}