(ns sicp.chpt1)

(defn square [x]
  (* x x))

(def else true)



(defn fast-expt-iter [b n a]
  (cond (= n 0) a
        (even? n) (fast-expt-iter (square b) (/ n 2) a)
        else (fast-expt-iter b (- n 1) (* a b))))



(defn fast-expt [b n]
  (fast-expt-iter b n 1))
