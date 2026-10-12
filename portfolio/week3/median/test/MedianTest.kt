// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    //Test for size 1
    "Median when size=1" {
        median(listOf(5.0)) shouldBe (5.0.toFloat() plusOrMinus tolerance)
    }

    //Test for size 2
    "Median when size=2" {
        median(listOf(1.0, 2.0)) shouldBe (1.5.toFloat() plusOrMinus tolerance)
    }

    //Test for size 3
    "Median when size=3" {
        median(listOf(3.0,4.0,5.0)) shouldBe (4.0.toFloat() plusOrMinus tolerance)
    }

    //Test for size 4
    "Median when size=4" {
        median(listOf(1.0,2.0,3.0,4.0)) shouldBe (2.5.toFloat() plusOrMinus tolerance)
    }
})
