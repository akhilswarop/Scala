@main def hof() =
    val filtered = (1 to 10).toList.filter(_ > 3).filter(_ < 7).map(_ * 10)
    print(filtered)