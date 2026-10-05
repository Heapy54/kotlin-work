// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
        if (args.size != 3) {
        println("Error: invalid input")
        exitProcess(1)
    }

    var currentTemp = args[0].toFloat()

    while(currentTemp <= args[1].toFloat()){
        val fahrenheit = (currentTemp * 1.8f)+32
        println("$currentTemp in Farenheit is $fahrenheit")
        currentTemp += args[2].toFloat()
    }
}
