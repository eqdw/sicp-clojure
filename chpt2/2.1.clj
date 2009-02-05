(ns sicp.chpt2)

(defn else [] true)

;; (defn gcd [a b]
;;   (method body))

(defn make-rat [n d]
  (let [g (gcd n d)]
    (cond (> 0 (* n d)) (cons (/ n g) (/ d g))
          (> n 0) (cons (- (/ n g)) (- (/ d g)))
          (else) (cons (/ n g) (/ d g)))))
