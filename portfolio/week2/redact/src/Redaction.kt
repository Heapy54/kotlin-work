// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(fileName: String, redactObject: String, redactChar: Char = 'X'): String{
    //creates a string of the same mength as the redacted word with the character given
    val redactedWord = redactChar.toString().repeat(redactObject.length)
    //then replaces all the occurances of that string in the given file
    val redacted = fileName.replace(redactObject,redactedWord)
    //returns the redacted string
    return redacted
}