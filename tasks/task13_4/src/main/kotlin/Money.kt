// Task 13.4: Money class
data class Money(var euros: Int, var cents: Int){
    operator fun plus(other: Money):Money{
        var totalCents = cents + other.cents
        var newEuros = 0
        while(totalCents >= 100){
            totalCents -= 100
            newEuros +=1
        }
        return Money(euros + other.euros + newEuros, totalCents)
    } 

    override fun toString(): String = "€$euros.$cents" 
}
