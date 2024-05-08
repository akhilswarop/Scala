def main(args: Array[String]) : Unit = {
    val map1 = Map("Gommal" -> 420, "Adangommaley" -> 200)
    println(map1)
    println(map1.getOrElse("Gommal", "Kedaikkala bro "))
}