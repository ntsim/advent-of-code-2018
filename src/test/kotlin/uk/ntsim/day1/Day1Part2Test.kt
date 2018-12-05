package uk.ntsim.day1

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class Day1Part2Test : StringSpec({
  "input of +1, -2, +3, +1, +1, -2 should return 2" {
    val input = """
      +1
      -2
      +3
      +1
      +1
      -2
    """.trimIndent()

    Day1Part2.solve(input).shouldBe(2)
  }

  "input of +1, -1 should return 0" {
    val input = """
      +1
      -1
    """.trimIndent()

    Day1Part2.solve(input).shouldBe(0)
  }

  "input of +3, +3, +4, -2, -4 should return 10" {
    val input = """
      +3
      +3
      +4
      -2
      -4
    """.trimIndent()

    Day1Part2.solve(input).shouldBe(10)
  }

  "input of -6, +3, +8, +5, -6 should return 5" {
    val input = """
      -6
      +3
      +8
      +5
      -6
    """.trimIndent()

    Day1Part2.solve(input).shouldBe(5)
  }

  "input of +7, +7, -2, -7, -4 should return 14" {
    val input = """
      +7
      +7
      -2
      -7
      -4
    """.trimIndent()

    Day1Part2.solve(input).shouldBe(14)
  }
})
