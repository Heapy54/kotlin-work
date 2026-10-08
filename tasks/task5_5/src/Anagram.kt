// Task 5.1.1: anagrams() function
infix fun String.anagrams(wordTwo: String): Boolean{
    val charOne = this.toCharArray().sorted().joinToString("")
    val charTwo = wordTwo.toCharArray().sorted().joinToString("")

    return charOne == charTwo
    

}