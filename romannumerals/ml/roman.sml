val romans = [("M", 1000), ("CM", 900), ("D", 500), ("CD", 400),
              ("C", 100),  ("XC", 90),  ("L", 50),  ("XL", 40),
              ("X", 10),   ("IX", 9),   ("V", 5),   ("IV", 4),
              ("I", 1)]

fun i2r(i, romans) =
  case romans of [] => ""
               | (r, a)::romans' => if i >= a then r ^ i2r(i-a, romans)
                                    else i2r(i, romans');

i2r(1999, romans);
i2r(4000, romans);
i2r(10, romans);
i2r(1, romans);
i2r(~1, romans);
