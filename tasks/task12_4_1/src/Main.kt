// Task 12.4.1: main program
fun main() {
    val center = Point(4.0,5.0)
    val circle = Circle(center, 16.0)
    val pointInCircle = Point(2.0,3.0)
    val pointOutCircle = Point(10.0,100.0)

    println(circle.area())
    println(circle.perimeter())
    println(circle.contains(pointInCircle))
    println(circle.contains(pointOutCircle))
}