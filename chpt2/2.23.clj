(ns sicp.chpt2)


(defn for-each [proc lst]
  (proc (first lst))
  (if (empty? (rest lst))
    true
    (for-each proc (rest lst))))




