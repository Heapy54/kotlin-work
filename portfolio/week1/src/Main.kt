// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main (args: Array<String>){
    //checks size of the input array
    if (args.size !=3 ){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    //converts all the lengths to a float
    val length_1 = args[0].toFloat()
    val length_2 = args[1].toFloat()
    val length_3 = args[2].toFloat()

    //calculate the value of the semiperimeter
    val semi_Perimeter = 0.5*(length_1+length_2+length_3)

    //calculate the value of the area
    val area = sqrt(semi_Perimeter*(semi_Perimeter-length_1)*(semi_Perimeter-length_2)*(semi_Perimeter-length_3))

    //print the answer in the correct form
    println("Area = %.5f".format(area))

}