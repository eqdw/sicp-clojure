(ns sicp.chpt1)

(defn inc [x]
  (+ x 1))

(defn dec [x]
  (- x 1))

(defn add-example-one [a b]
  (if (= 0 a)
    b
    (inc (add-example-one (dec a) b))))

;;(a-e-1 4 5)
;;(inc (a-e-1 3 5))
;;(inc (inc (a-e-1 2 5)))
;;(inc (inc (inc (a-e-1 1 5))))
;;(inc (inc (inc (inc (a-e-1 0 5)))))
;;(inc (inc (inc (inc 5))))
;;(inc (inc (inc 6)))
;;(inc (inc 7))
;;(inc 8)
;;9
;;RECURSIVE PROCESS

(defn add-example-two [a b]
  (if (= 0 a)
    b
    (add-example-two (dec a) (inc b))))

;;(a-e-2 4 5)
;;(a-e-2 3 6)
;;(a-e-2 2 7)
;;(a-e-2 1 8)
;;(a-e-2 0 9)
;;ITERATIVE PROCESS