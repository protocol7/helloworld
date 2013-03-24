#lang racket

(define romans (list (list "M" 1000) (list "CM" 900) (list "D" 500) (list "CD" 400)
                     (list "C" 100)  (list "XC" 90)  (list "L" 50)  (list "XL" 40)
                     (list "X" 10)   (list "IX" 9)   (list "V" 5)   (list "IV" 4)
                     (list "I" 1)
               )
)

(define (roman i romans)
  (if (null? romans)
    ""
    (begin
      (let ([r (caar romans)]
            [a (cadar romans)])
        (if (>= i a)
          (string-append r (roman (- i a) romans))
          (roman i (cdr romans))
        )
      )
    )
  )
)

(roman 1999 romans)
(roman 40 romans)
(roman 1 romans)
(roman -1 romans)
