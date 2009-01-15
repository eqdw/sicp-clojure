(ns sicp.chpt1)



;;good-enough? returns true when the difference between the square of the guess
;;and the original value to be sqrt'd is less than 0.001. For very small numbers
;;(such as numbers <0.001) this will not be effective. As well, for very large
;;numbers the program will iterate many times more than is necessary from a
;;practial perspective. This could be improved by rewriting good-enough? to
;;terminate when the change in guess is a small fraction of the value of guess

(defn abs [x]
  ( if (x < 0)
    (- x)
    x))

(defn average [x y]
  (/ (+ x y) 2))

(defn improve [guess x]
  (average guess (/ x guess)))

;;This will terminate when the change in guess is 0.1% of the value of guess
(defn good-enough? [guess x]
  (< (/ (abs (- guess (improve guess x))) guess) 0.001))