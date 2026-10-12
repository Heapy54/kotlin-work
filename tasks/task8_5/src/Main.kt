// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    var text = "Hello world"
    val vowelCount = text.howMany{ it.lowercase() in "aeiou"}
    println("Text contains $vowelCount vowels")
    
    val captialCount = text.howMany{ it.isUpperCase()}
    println("Text contains $captialCount Capitals")

    val lowercaseCount = text.howMany{ it.isLowerCase()}
    println("Text contains $lowercaseCount lower case")

    val  punctuationCount= text.howMany{ it.lowercase() in ".?!"}
    println("Text contains $punctuationCount punctuation")
}
