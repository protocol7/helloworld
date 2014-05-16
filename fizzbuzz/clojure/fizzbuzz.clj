(doall (map (fn [i] (println (cond
                      (zero? (mod i 15)) "FizzBuzz"
                      (zero? (mod i 3)) "Fizz"
                      (zero? (mod i 5)) "Buzz"
                      :else i)))
            (range 1 101)))
