// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val sideA: Double,val sideB: Double,val sideC: Double){

    init{
        require(isValidTriangle())
        }
    // Add isValidTriangle() and triangleArea() functions here
    fun isValidTriangle() : Boolean{
        //checks if the sums of the length of the other siodes is less than the lenght of one side
        if(sideA < (sideB+sideC) 
        && sideB <(sideA+sideC) 
        && sideC<(sideA+sideB)){
            //if valid triangle return true
            return true
        }
        return false
    }
    val perimeter : Double 
        get() = sideA+sideB+sideC
    val semiPerimeter : Double 
        get() = 0.5*perimeter

    val area: Double
        get() = sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC))

    override fun toString(): String{
        return "Triangle($sideA, $sideB, $sideC)"
    }
}