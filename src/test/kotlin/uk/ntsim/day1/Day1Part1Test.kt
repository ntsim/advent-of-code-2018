package uk.ntsim.day1

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class Day1Part1Test : StringSpec({
  "input of +1, -2, +3, +1 should return 3" {
    val input = """
      +1
      -2
      +3
      +1
    """.trimIndent()

    Day1Part1.solve(input).shouldBe(3)
  }

  "input of +1, +1, +1 should return 3" {
    val input = """
      +1
      +1
      +1
    """.trimIndent()

    Day1Part1.solve(input).shouldBe(3)
  }

  "input of +1, +1, -2 should return 0" {
    val input = """
      +1
      +1
      +1
    """.trimIndent()

    Day1Part1.solve(input).shouldBe(3)
  }

  "input of -1, -2, -3 should return -6" {
    val input = """
      -1
      -2
      -3
    """.trimIndent()

    Day1Part1.solve(input).shouldBe(-6)
  }
})
