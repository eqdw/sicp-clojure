(ns sicp.chpt1)

(defn recursive-f [n]
  (if (< n 3)
  n
  (+ (recursive-f (- n 1)) (* 2 (recursive-f (- n 2))) (* 3 (recursive-f (- n 3))))))


(defn iter-f [n]
  (if (< n 3)
    n
    (f-iter n 3 2 1 0)))

(defn f-iter [n i fn-1 fn-2 fn-3]
  (let [f (+ fn-1 (* 2 fn-2) (* 3 fn-3))]
    (if (= n i)
      f
      (f-iter n (+ i 1) f fn-1 fn-2))))
