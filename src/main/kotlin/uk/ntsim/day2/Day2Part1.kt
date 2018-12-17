package uk.ntsim.day2

import uk.ntsim.utils.readFile
import kotlin.streams.toList

object Day2Part1 {
  data class LineCharCount(
    val hasTwo: Boolean,
    val hasThree: Boolean
  )

  data class CharTotals(
    val twoChars: Int,
    val threeChars: Int
  )

  fun solve(input: String): Int {
    val totals = input.lines()
      .parallelStream()
      .map { line ->
        val counts = line.toSet()
          .map { char -> line.count { it == char } }
          .filter { it >= 2 }

        LineCharCount(
          hasTwo = counts.any { it == 2 },
          hasThree = counts.any { it == 3 }
        )
      }
      .toList()
      .fold(CharTotals(0, 0)) { charTotals, lineCharCount ->
        CharTotals(
          if (lineCharCount.hasTwo) charTotals.twoChars + 1 else charTotals.twoChars,
          if (lineCharCount.hasThree) charTotals.threeChars + 1 else charTotals.threeChars
        )
      }

    return totals.twoChars * totals.threeChars
  }
}

fun main(args: Array<String>) {
  println(Day2Part1.solve(readFile("Day2.txt")))
}
