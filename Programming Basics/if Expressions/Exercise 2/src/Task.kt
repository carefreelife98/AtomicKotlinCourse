// IfExpressions/Task2.kt
package ifExpressionsExercise2

fun abs(number: Int): Int =
  if(number > 0) number
  else if (number < 0) number * -1
  else 0

fun main() {
  println(abs(-19))  // 19
}