(ns sicp.chpt1)

(defn else [] true)


(defn filtered-accumulate [func base filter term a b]
  (cond (filter a) (func (term a) (filtered-accumulate func base filter term (inc a) b))
        (= a b) base
        (else) (filtered-accumulate func base filter (inc a) b)))

;;This isn't perfect but I an't quite explain why

(defn sum-sq-of-primes [a b]
  (filtered-accumulate + 0 prime? (fn [n] n) a b))

(defn prod-rel-prime [a b]
  (filtered-accumulate * 1 (fn [n] (gcd b n)) (fn [n] n) a b))