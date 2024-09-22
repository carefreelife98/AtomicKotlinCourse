// Booleans/Task2.kt
package booleansExercise2

fun showAnd(first: Boolean, second: Boolean){
  println("$first && $second == ${first && second}")
}

fun showOr(first: Boolean, second: Boolean){
  println("$first || $second == ${first || second}")
}

fun showTruthTable() {
  val table:Array<Array<Boolean>> = arrayOf(
    arrayOf(true, true),
    arrayOf(true, false),
    arrayOf(false, true),
    arrayOf(false, false),
  )

  for (row in table) {
    showAnd(row[0], row[1])
    showOr(row[0], row[1])
  }
}

fun main() {
  showTruthTable()
}