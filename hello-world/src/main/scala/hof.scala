object hof{
    def f() = {
        (1 to 10).toList.filter(_ < 5).map(_ * 100)
        val l = List(1,2,3,4,5,6)
        val doubleSalary = (x:Int) => x*2 
        print(l.map(doubleSalary))
    }

    def main(args: Array[String]):Unit = {
        print(f())
    }
}
