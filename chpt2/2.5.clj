(ns sicp.chpt2)

;;Trust me. You can. But it isn't computationally pretty

;; (defn power-iter [b p s]
;;   (if (= p 0)
;;     s
;;     (power-iter b (dec p) (+ b s))))

;; (defn power [b p]
;;   (power-iter b p 1))


;; (defn log-iter [b n r]
;;   (if (= n 1)
;;     r
;;     (log-iter b (/ n b) (inc r))))

;; ;;restricted to returning an integer, that is the value of log_b(n) where
;; ;;b and n are both integers
;; (defn log [b n]
;;   (log-iter b n 0))

(defn cons+ [a b]
  (* (power 2 a) (power 3 b)))

(defn car+-iter [p ret]
  (if (= (rem p 2))
    (car+-iter (/ p 2) (inc ret))
    ret))

(defn car+ [p]
  (car+-iter p 0))

(defn cdr+-iter [p ret]
  (if (= (rem p 3))
    (cdr+-iter (/ p 3) (inc ret))
    ret))

(defn cdr+ [p]
  (cdr+-iter p 0))


;;Works in theory. But it's a really dumb way of doing it. If you can make
;;a computer do this efficiently, I've got a job for you at the NSA



