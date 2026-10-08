// Task 5.2.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: invalid input")
        exitProcess(1)
    }

    val area = circleArea(args[0].toDouble())
    val perimeter = cirlcePerimeter(args[0].toDouble())

    println("The area of the circle is $area")
    println("The perimeter of the circle is $perimeter")
}