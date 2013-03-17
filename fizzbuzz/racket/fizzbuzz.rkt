#lang racket

(define (fizzbuzz n)
  (if (= n 0)
    #t
    (begin
      (fizzbuzz (- n 1))
      (printf "~a\n"
        (match (list (modulo n 3) (modulo n 5))
          [(list 0 0) "FizzBuzz"]
          [(list 0 _) "Fizz"]
          [(list _ 0) "Buzz"]
          [_ n]
        )
      )
    )
  )
)

(fizzbuzz 100)
