// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate
fun main(){
    val singlePerson = Person("Joe", "1984-12-05")
    println(singlePerson.name)
    println(singlePerson.birth)
}