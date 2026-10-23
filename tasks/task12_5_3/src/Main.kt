// Task 12.5.3: demo program for class with custom setter
import kotlinx.datetime.LocalDate

fun main(){
    val person = Person("    ",LocalDate.parse("1984-12-05"))
    println(person.name)
}