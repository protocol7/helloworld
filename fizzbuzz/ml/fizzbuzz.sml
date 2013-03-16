fun fizzbuzz(range) =
    List.rev(List.foldl(fn (i, xs) => if i mod 15 = 0 then "FizzBuzz" :: xs
                            else if i mod 3 = 0 then "Fizz" :: xs
                            else if i mod 5 = 0 then "Buzz" :: xs
                            else Int.toString(i) :: xs) [] range);

fizzbuzz(List.tabulate(100, fn x => x+1));

fun fizzbuzz2([]) = []
  | fizzbuzz2(i::xs) = if i mod 15 = 0 then "FizzBuzz" :: fizzbuzz2(xs)
                       else if i mod 3 = 0 then "Fizz" :: fizzbuzz2(xs)
                       else if i mod 5 = 0 then "Buzz" :: fizzbuzz2(xs)
                       else Int.toString(i) :: fizzbuzz2(xs);

fizzbuzz2(List.tabulate(100, fn x => x+1));
