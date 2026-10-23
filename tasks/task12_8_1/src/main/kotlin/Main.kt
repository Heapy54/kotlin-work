// Task 12.8.1: demo program for Day enum class
import Day.*

fun main(){
    print("Enter a day: ")
    val input = readln().capitalize()

    val day = Day.valueOf(input)

    println(day)
}