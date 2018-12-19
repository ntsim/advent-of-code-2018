package uk.ntsim.day2

import uk.ntsim.utils.readFile

object Day2Part2 {
  fun solve(input: String): String {
    val lines = input.lines().filter { it.isNotEmpty() }

    lines.forEach { currentLine ->
      val matchingBox = lines
        .map { line ->
          line.foldIndexed("") { charIndex, acc, char ->
            if (currentLine[charIndex] == char) acc + char else acc
          }
        }
        .find { it.length == currentLine.length - 1 }

      if (matchingBox != null) {
        return matchingBox
      }
    }

    return ""
  }
}

fun main(args: Array<String>) {
  println(Day2Part2.solve(readFile("Day2.txt")))
}
