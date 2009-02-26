(ns sicp.chpt2)

(defn last-pair [lst]
  (if (= (rest lst) nil)
    (list (first lst))
    (last-pair (rest lst))))

