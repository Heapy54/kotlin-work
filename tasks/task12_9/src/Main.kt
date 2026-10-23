// Task 12.9: demo program for class implementing Static Factory Method
import kotlinx.datetime.LocalDate

fun main(){
    val p = Person.create("Dan", LocalDate(2006,11,22))
    val p2 = Person.create("Will", LocalDate(2006,11,22))
    
}