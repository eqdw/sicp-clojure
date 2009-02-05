(ns sicp.chpt1)

(defn product [term a next b]
  (if (or (> a b) (= a b))
    (term a)
    (* (term a) (product term (next a) next b))))






(defn factorial [n]
     (product (fn [a] a) 1 inc n))

;;p = precision (no particular unit)
(defn pi-by-four [p]
  (/
   (* 2.0 (product (fn [a] (* a a)) 4.0 (fn [a] (+ a 2)) p))
   (product (fn [a] (* a a)) 3.0 (fn [a] (+ a 2)) p)))


(pi-by-four 16.0)


