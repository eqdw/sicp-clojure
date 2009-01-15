(ns sicp.chpt1)



(defn sq-large-nums [x y z]
  ( cond (and (< y x) (< y z)) (sq-large-nums y x z)
         (and (< z x) (< z y)) (sq-large-nums z y x)
         true (+ (* y y) (* z z))))