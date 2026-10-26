// Task 15.2.3: SavingsAccount class

class SavingsAccount(holder :String, val rate : Double) : BankAccount(holder){
    fun applyInterest(){
        val increase = (balance * rate/100).toInt()
        deposit(increase)
        println("New balance is $balance")
    }
}