(ns sicp.chpt2)

(defn horner-eval [x coefficients]
  (reduce (fn [total coeff] (+ (* total x) coeff))
          0
          coefficients))
