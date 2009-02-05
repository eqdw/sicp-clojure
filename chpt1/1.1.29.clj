(ns sicp.chpt1)

(defn else [] true)

(defn cube [x] (* x x x))

(defn simpson-int [f a b n]
  (let [h (/ (- b a) n)]
    (/ (* h (simpson-int-recur f a b h n)) 3)))








  (defn simpson-int-recur [f a b h n]
      (cond (= a (- b (* n h))) (+ (f (- b (* n h))) (simpson-int-recur f a b h (dec n)))
            (= 0 (rem n 2)) (+ (* 2 (f (- b (* n h)))) (simpson-int-recur f a b h (dec n)))
            (= 0 (dec (rem n 2))) (+ (* 4 (f (- b (* n h)))) (simpson-int-recur f a b h (dec n)))
            (else) (f (- b (* n h)))))




;;(0->1)INT:(x^3 dx) == (x^4)/4 \ (0->1) = 1/4 - 0/4  = 1/4



(defn cube [x]
  (* x x x))


(simpson-int cube 0.0 1.0 100)



