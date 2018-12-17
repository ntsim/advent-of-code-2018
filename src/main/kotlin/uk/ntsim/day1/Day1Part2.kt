package uk.ntsim.day1

import uk.ntsim.utils.readFile

object Day1Part2 {
  fun solve(input: String): Int {
    val changes = input.lines()
      .filter { it.isNotEmpty() }
      .map { it.toInt() }

    val frequencies = mutableSetOf(0)
    var frequency = 0

    fun iterateLines() {
      changes.forEach {
        frequency += it

        if (frequencies.contains(frequency)) {
          return
        }

        frequencies.add(frequency)
      }

      iterateLines()
    }

    iterateLines()

    return frequency
  }
}

fun main(args: Array<String>) {
  println(Day1Part2.solve(readFile("Day1.txt")));
}
