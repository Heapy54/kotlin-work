// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
        if (args.size != 1) {
        println("Error: invalid input")
        exitProcess(1)
    }

    val stnsData = fetchData(args[0])

    val minTemp = stnsData.minByOrNull {it.second}
    println(minTemp)

    val maxTemp = stnsData.maxByOrNull {it.second}
    println(maxTemp)

    val avrgTemp = averageTemp(stnsData)
    println(avrgTemp)
}