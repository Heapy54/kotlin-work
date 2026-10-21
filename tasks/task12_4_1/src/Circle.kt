// Task 12.4.1: Circle class
import kotlin.math.PI
import kotlin.math.hypot

class Circle(val center: Point, val radius: Double){
    init{
        require(radius>0)
    }

    fun area() = (PI*(radius*radius))

    fun perimeter() = (PI*(radius*2.0))

    fun contains(point : Point) :Boolean{
        return hypot((center.x-point.x),(center.y-point.y)) < radius
    }
}