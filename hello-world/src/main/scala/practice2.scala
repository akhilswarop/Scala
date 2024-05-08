object scala_basic {

    def thirty(a:Int, b:Int):Boolean = {
        if(a == 30 || b == 30 || a + b == 30)
            true
        else
            false
    }

    def main(args: Array[String]): Unit = {
        println(thirty(30,0))
        println(thirty(15,15))
    }
}