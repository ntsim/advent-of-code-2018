package uk.ntsim.day1

import uk.ntsim.utils.readFile

object Day1Part1 {
  fun solve(input: String): Int = input.lines()
    .filter { it.isNotEmpty() }
    .map { it.toInt() }
    .sum();
}

fun main(args: Array<String>) {
  println(Day1Part1.solve(readFile("Day1.txt")));
}
