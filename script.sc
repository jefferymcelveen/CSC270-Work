import scala.io.Source

:load utilities.sc

val myLines: Vector[String] = loadFile("text/pg23.txt")
val v: Vector[String] = Vector(
  "dogs"
  "cats"
  "fish"
