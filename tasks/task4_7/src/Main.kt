// Task 4.7: finding the longest line in a file
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: invalid input")
        exitProcess(1)
    }

    val fileName = args[0]
    val filePath = Path(fileName)

    var longestLine = 0
    var longestLineNumber = 0
    var lineNumber = 0

    filePath.forEachLine{
        lineNumber += 1
        if(it.length > longestLine){
            longestLine = it.length
            longestLineNumber = lineNumber
        } 
    }

    println("line $longestLineNumber is the longest (length = $longestLine)")


}