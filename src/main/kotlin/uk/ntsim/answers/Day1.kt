package uk.ntsim.answers

fun main(args: Array<String>) {
  val file = {}.javaClass.classLoader.getResource("Day1.txt")

  println(file.readText())
}
