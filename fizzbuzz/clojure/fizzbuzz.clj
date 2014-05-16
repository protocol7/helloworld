(defn div? [x n] (zero? (mod x n)))
(doall (map #(println (cond
                      (div? % 15) "FizzBuzz"
                      (div? % 3) "Fizz"
                      (div? % 5) "Buzz"
                      :else %))
            (range 1 101)))
