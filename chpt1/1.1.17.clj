(ns sicp.chpt1)

(defn else []
  true)

(defn dbl [x]
  (+ x x))

(defn halve [x]
  (/ x 2))


(defn fast-mult-recur [a b]
  (cond (= b 1) a
        (even? b) (dbl (fast-mult-recur a (halve b)))
        (else) (+ b (fast-mult-recur a (- b 1)))))
        
