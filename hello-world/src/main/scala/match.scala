object casem {
def thirty(a: Int): Int = {
  a match {
    case 1 => 1
    case 2 => 3
    case _ => 0
  }
}

def main(args: Array[String]): Unit = {
    println(thirty(2))
    println(thirty(20))
}
}