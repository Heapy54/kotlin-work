// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate


fun main(){
    val person = Person("Fred",LocalDate.parse("2006-10-22"))
    println(person.age)
}