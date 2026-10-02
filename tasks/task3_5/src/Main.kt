// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    // Add your code here

    //Creates a path to the file
    val path = Path("test.txt")

    //writes to the file
    path.writeText("Fred is a horrible boy")

    //writes over the previous write line
    path.appendText("\nFred is a lovely boy")

    //reading the file
    val fileContent = path.readText()
    println(fileContent)




}
