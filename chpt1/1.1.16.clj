(ns sicp.chpt1)

(defn square [x]
  (* x x))

(def else true)



;; This is recursive. TODO: do it iteratively
;; (defn fast-expt [b n]
;;   (cond (= n 0) 1
;;         (even? n) (square (fast-expt b (/ n 2)))
;;         (* b (fast-expt b (- n 1)))))


(defn fast-expt-iter [b n a]
  (cond (= n 0) a
        (even? n) (fast-expt-iter b (/ n 2) (* a (square b)))
        else (fast-expt-iter b (- n 1) (* a b))))


(fast-expt-iter 10 2 1)

;;TODO: make work



(defn fast-expt [b n]
  (fast-expt-iter b n 1))


(fast-expt 10 2)


;;10^2 = (10^1)^2 = (10^2)^1
;;10

