package uk.ntsim.utils

import java.net.URL

fun readFile(resourceFile: String): String =
  {}.javaClass.classLoader.getResource(resourceFile).readText()
