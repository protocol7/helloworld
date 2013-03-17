#lang racket

(define (fizzbuzz n)
  (if (= n 0)
    #t
    (begin
      (fizzbuzz (- n 1))
      (cond
        [(= 0 (modulo n 15)) (printf "FizzBuzz\n")]
        [(= 0 (modulo n 3)) (printf "Fizz\n")]
        [(= 0 (modulo n 5)) (printf "Buzz\n")]
        [else (printf "~a\n" n)]
        )
      )
    )
  )

(fizzbuzz 100)
