// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle) : Boolean{
    //checks if the sums of the length of the other siodes is less than the lenght of one side
    if(triangle.first < (triangle.second+triangle.third) 
    && triangle.second <(triangle.first+triangle.third) 
    && triangle.third<(triangle.first+triangle.second)){
        //if valid triangle return true
        return true
    }
    return false
}

fun triangleArea(triangle: Triangle): Double{
    //calculate the value of the semiperimeter
    val semi_Perimeter = 0.5*(triangle.first+triangle.second+triangle.third)

    //calculate the value of the area
    val area = sqrt(semi_Perimeter*(semi_Perimeter-triangle.first)*(semi_Perimeter-triangle.second)*(semi_Perimeter-triangle.third))

    return area
}