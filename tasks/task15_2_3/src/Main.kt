// Task 15.2.3: demo program

fun main() {
    // Write code to demonstrate the classes here
    val savingAccount = SavingsAccount("Dan", 0.20)

    savingAccount.deposit(1250)
    repeat(5){
        savingAccount.applyInterest()
    }

    savingAccount.withdraw(50)

    println("Final balance is ${savingAccount.balance}")
}
