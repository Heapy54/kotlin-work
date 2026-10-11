// Task 7.7.1: statistics functions
fun median(numbers: List<Double>): Double{
    val sorted = numbers.sorted()
    val middle = sorted.size / 2

    return if (sorted.size % 2 == 0){
        (sorted[middle-1] + sorted[middle]) / 2
    } else{
        sorted[middle]
    }
}

fun displayStats(numbers: List<Double>) {
    println("Mean: ${numbers.average()}")
    println("Median: ${median(numbers)}")
    println("Minimum: ${numbers.minOrNull()}")
    println("Maximum: ${numbers.maxOrNull()}")
}
