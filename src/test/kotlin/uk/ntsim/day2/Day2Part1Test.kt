package uk.ntsim.day2

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class Day2Part1Test: StringSpec({
  "given input returns 12" {
    val input = """
        abcdef
        bababc
        abbcde
        abcccd
        aabcdd
        abcdee
        ababab
    """.trimIndent()

    Day2Part1.solve(input).shouldBe(12)
  }
})
