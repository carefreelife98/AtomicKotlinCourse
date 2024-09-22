// NumberTypes/Task4.kt
package numberTypesExercise4

import varargs.second

fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long =
  seconds * 1000L + minutes * 60000L + hours * 3600000L

fun main() {
  println(convertToMilliseconds(1, 30, 0))
}