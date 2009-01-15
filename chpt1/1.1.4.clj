(ns sicp.chpt1)


(defn a-plus-abs-b [a b]
  ((if (> b 0) + -) a b))

;;if b is greater than zero, the function generates (+ a b) which
;;evaluates to the sum of a and b.
;;if b is less than zero, the function generates (- a b) which
;;evaluates to the sum of a and -b.
;;The end result is the sum of a, and the absolute value of b