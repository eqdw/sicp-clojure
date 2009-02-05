(ns sicp.chpt1)





(defn sum [term a next b]
  (defn iter [a result]
    (if (= a b)
        (+ result (term a))
        (iter (next a) (+ (term a) result))))
  (iter a 0))
