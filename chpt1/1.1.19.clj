(ns sicp.chpt1)

(defn else [] true)

(defn fib-iter [a b p q count]
  (let [pp (+ (* p p) (* q q))
        qq (+ (* 2 p q) (* q q))]
    (cond (= count 0) b
          (even? count)
            (fib-iter a
                      b
                      pp;;(+ (* p p) (* q q))
                      qq;;(+ (* 2 p q) (* q q))
                      (/ count 2))
          (else)
            (fib-iter (+ (* b q) (* a q) (* a p))
                           (+ (* b p) (* a q))
                           p
                           q
                           (- count 1)))))


(defn fib [n]
  (fib-iter 1 0 0 1 n))

(fib 1)

