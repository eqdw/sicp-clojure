(ns sicp.chpt1)

(defn recursive-f [n]
  (if (< n 3)
  n
  (+ (recursive-f (- n 1)) (* 2 (recursive-f (- n 2))) (* 3 (recursive-f (- n 3))))))


;;(recur-f 10)
;;(+ (recur-f 9) (* 2 (recur-f 8)) (* 3 (recur-f 7)))
;;(+ ((recur-f 8) (* 2 (recur-f 7)) (* 3 (recur-f 6)))) ...



(defn iter-f [n]
  ;;todo: All
  )
  