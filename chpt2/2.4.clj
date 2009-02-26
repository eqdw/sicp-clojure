(ns sicp.chpt2)


(defn cons+ [x y]
  (fn [m] (m x y)))

(defn car+ [z]
  (z (fn [p q] p)))

(defn cdr+ [z]
  (z (fn [p q] q)))

(car+ (cons+ 5 9))
;;(car+ (fn [m] (m 5 9))) ;;func of 1 param
;;((fn [m] (m 5 9)) (fn [p q] p))
;;((fn [p q] p) 5 9)
;;5
(cdr+ (cons+ 5 9))
;;(cdr+ (fn [m] (m 5 9)))
;;((fn [m] (m 5 9)) (fn [p q] q))
;;((fn [p q] q) 5 9)
;; 9