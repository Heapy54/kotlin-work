// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDie(numberDice: Int = 1,sides: Int = 6){
    for(n in 1..numberDice){
        if(sides in setOf(4, 6, 8, 10, 12, 20)){
            println("Rolling $n d $sides ... ")
            val result = Random.nextInt(1, sides+1)
            println("You rolled a $result")
        }
        else{
            println("Error cannot have an $sides dice")
        }
    }
}