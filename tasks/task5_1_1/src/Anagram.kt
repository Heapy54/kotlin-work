// Task 5.1.1: anagrams() function
fun anagrams(wordOne: String, wordTwo: String): Boolean{
    val charOne = wordOne.toCharArray().sorted().joinToString("")
    val charTwo = wordTwo.toCharArray().sorted().joinToString("")

    if(charOne == charTwo){
        return true
    }
    else{
        return false
    }

}