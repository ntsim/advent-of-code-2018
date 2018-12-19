package uk.ntsim.day2

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import uk.ntsim.utils.readFile

class Day2Part2Test : StringSpec({
  "given input returns `fgij`" {
    val input = """
      abcde
      fghij
      klmno
      pqrst
      fguij
      axcye
      wvxyz
    """.trimIndent()

    Day2Part2.solve(input).shouldBe("fgij")
  }

  "given input returns `tjxmoewpdkyaihvrndfluwbzc`" {
    val input = readFile("Day2.txt")

    Day2Part2.solve(input).shouldBe("tjxmoewpdkyaihvrndfluwbzc")
  }
})
