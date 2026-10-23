// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate
fun main(args: Array<String>) {
    val person = Person("fred",LocalDate.parse("1984-12-05"))
    println(person.name)
}