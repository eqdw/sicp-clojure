(ns sicp.chpt1)

(defn f [g] (g 2))

(f (fn [n] (* n (+ n 1))))



;;(f f)
;;(f 2)
;;(2 2)
;;FAIL