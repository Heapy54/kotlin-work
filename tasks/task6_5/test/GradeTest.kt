// Task 6.5: unit tests for grade()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class GradeTest : FreeSpec({

    "Mark of 85 gives a Distinction" {
        grade(85) shouldBe "Distinction"
    }

    "Mark of 20 gives a Fail" {
        grade(20) shouldBe "Fail"
    }

    "Mark of 50 gives a Pass" {
        grade(50) shouldBe "Pass"
    }

    "Mark of 69 gives a Pass" {
        grade(69) shouldBe "Pass"
    }

    "Mark of 100 gives a Distinction" {
        grade(100) shouldBe "Distinction"
    }

    "Mark of 115 gives a question mark" {
        grade(115) shouldBe "?"
    }
})