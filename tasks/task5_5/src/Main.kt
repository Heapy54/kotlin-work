// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size != 2) {
        println("Error: invalid input")
        exitProcess(1)
    }

    if (args[1].anagrams(args[0])) {
    println("${args[0]} and ${args[1]} are anagrams!")
}

}