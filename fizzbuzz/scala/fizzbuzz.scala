object FizzBuzz extends Application {
  val fizzbuzz = {
    def loop(i: Int): Stream[String] =
      ((i % 3, i%5) match {
        case (0,0) => "FizzBuzz"
        case (0,_) => "Fizz"
        case (_,0) => "Buzz"
        case _ => i.toString()
      }) #:: loop(i + 1)
    loop(1)
  }

  fizzbuzz take 100 foreach println
}
