(ns sicp.chpt2)

(def car first)
(def cdr rest)

(defn zero (fn [f] (fn [x] x)))
(defn add-1 [n]
  (fn [f] (fn [x] (f ((n f) x)))))

;;
;; (defn one (add-1 zero))
;; (defn one (fn [f] (fn [x] (f ((zero f) x)))))
;; (defn one (fn [f] (fn [x] (f (( (fn [f2] (fn [x2] x2)) f) x)))))



(defn one (fn [f] (fn [x] (f (( (fn [f2] (fn [x2] x2)) f) x))))) 


;;for the rest of this, JUST NO
;; this was complicated enough in The Little Schemer. SICP gives no justification
;; or intro to church numerals, and so I'm not going to even try
