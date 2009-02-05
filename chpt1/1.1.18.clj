(ns sicp.chpt1)


(defn dbl [x]
  (+ x x))

(defn halve [x]
  (/ x 2))

(defn else []
  true)


(defn fast-mult-iter [a b s]
  (cond (= b 1) (+ s a)
        (even? b) (fast-mult-iter (dbl a) (halve b) s)
        (else) (fast-mult-iter a (- b 1) (+ s b))))

(defn fast-mult [a b]
  (fast-mult-iter a b 0))

