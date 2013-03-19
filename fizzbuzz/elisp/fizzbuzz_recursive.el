(defun fizzbuzz_recursive (x a)
  "Recursive helper function"
  (if (< x a)
	  (let ((fizz (= (% x 3) 0)) (buzz (= (% x 5) 0)))
		(cond
		 ((and fizz buzz)
		  (insert "FizzBuzz"))
		 (fizz
		  (insert "Fizz"))
		 (buzz
		  (insert "Buzz"))
		 (t
		  (insert (number-to-string x))))
		(newline)
		(fizzbuzz_recursive (+ x 1) a))))

(defun fizzbuzz (a)
  "FizzBuzz in elisp"
  (interactive "nMax: ")
  (fizzbuzz_recursive 1 a))
