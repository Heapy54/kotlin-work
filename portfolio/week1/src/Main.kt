// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main (args: Array<String>){
    if (args.size !=3 ){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    val length_1 = args[0].toFloat()
    val length_2 = args[1].toFloat()
    val length_3 = args[2].toFloat()

    val semi_Perimeter = 0.5*(length_1+length_2+length_3)

    val area = sqrt(semi_Perimeter*(semi_Perimeter-length_1)*(semi_Perimeter-length_2)*(semi_Perimeter-length_3))

    println("Area = %.5f".format(area))

}