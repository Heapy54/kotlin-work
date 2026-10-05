// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess


fun main(args: Array<String>) {
    //check input size
    if (args.size != 3) {
        println("Error: invalid input")
        exitProcess(1)
    }

    for(scoreString in args){
        var score = scoreString.toInt()

        when(score){
            in 70..100 -> println("$score is a Distinction")

            in 40..69 -> println("$score is a Pass")

            in 0..39 -> println("$score is a Fail")
        }

    }
}