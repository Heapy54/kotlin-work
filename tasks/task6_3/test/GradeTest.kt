// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    // Write tests here
    @Test
    fun `Mark of 55 gives a Pass`(){
        assertEquals("Pass",grade(55))
    }

    @Test
    fun `Mark of 30 gives a Fail`(){
        assertEquals("Fail",grade(30))
    }

    @Test
    fun `Mark of 89 gives a Distinction`(){
        assertEquals("Distinction",grade(89))
    }

    @Test
    fun `Mark of 105 gives a ?`(){
        assertEquals("?",grade(105))
    }

    @Test
    fun `Mark of 0 gives a Fail`(){
        assertEquals("Fail",grade(0))
    }

    @Test
    fun `Mark of 100 gives a Distincition`(){
        assertEquals("Distinction",grade(100))
    }

}
