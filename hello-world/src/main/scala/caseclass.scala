// define a case class
case class Person(
  name: String,
  vocation: String
)

@main def printobj() = {
// create an instance of the case class
val p = Person("Reginald Kenneth Dwight", "Singer")
val p2 = p.copy(name = "Elton John")
print(s"$p  $p2")
}