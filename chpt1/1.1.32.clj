(ns sicp.chpt1)


(defn accumulate [combiner base-val term a next b]
  (if (or (> a b) (= a b))
    base-val
    (combiner (term a) (accumulate combiner base-val term (next a) next b))))



(defn iter-accum [combiner base-val term a next b]
  (defn iter [a result]
    (if (or (> a b) (= a b))
      (combiner result base-val)
      (iter (next a) (combiner (term a) result))))
  (iter a 0))
;;note that this won't work if combiner is *. How to fix? 