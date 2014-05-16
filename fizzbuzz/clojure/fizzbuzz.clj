(defn div? [x n] (zero? (mod x n)))
(doall (map (fn [i] (println (cond
                      (div? i 15) "FizzBuzz"
                      (div? i 3) "Fizz"
                      (div? i 5) "Buzz"
                      :else i)))
            (range 1 101)))
