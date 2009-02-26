(ns sicp.chpt2)


;;this is screwed up, pissing me off, and I don't much care for it

;; (defn other-rvs [lst]
;;   (if (empty? lst)
;;     (first lst)
;;     (conj (reverse (rest lst)) (first lst))))

;; (other-rvs '(1 2 3 4))

;;hell, easiest implementation:
(defn rever [lst]
  (reverse lst))



(defn length [lst]
  (if (empty? lst)
    0
    (+ 1 (length (rest lst)))))

(defn reverse-iter [lst rtn]
  (if (empty? (rest lst))
    (cons (first lst) rtn)
    (recur (rest lst) (cons (first lst) rtn))))

(defn reversee [lst]
  (reverse-iter lst '()))

(reversee '(1 2 3 4))
