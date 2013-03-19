(defun fizzbuzz (a)
  "FizzBuzz in elisp"
  (interactive "nMax: ")
  (let ((x 1))
	(while (< x a)
	  (let ((fizz (= (% x 3) 0)) (buzz (= (% x 5) 0)))
		(cond
		 ((and fizz buzz)
		  (insert "FizzBuzz"))
		 (fizz
		  (insert "Fizz"))
		 (buzz
		  (insert "Buzz"))
		 (t
		  (insert (number-to-string x)))))
	  (newline)
	  (setq x (+ x 1)))))
