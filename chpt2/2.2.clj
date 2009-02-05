(ns sicp.chpt2)

(def car first)

(def cdr rest)



(defn make-point [x y]
  (cons x y '()))

#'user/make-point
(defn x-point [pt]
  (car pt))

(defn y-point [pt]
  (cdr pt))

(defn make-segment [pt ptt]
  (cons pt ptt '()))




(defn start-segment [pt]
  (car pt))

(defn end-segment [pt]
  (cdr pt))



(defn print-pt [pt]
  (println (str "(" (x-point pt) "," (y-point pt) ")")))



(defn midpoint-segment [line]
  (make-point
    (/ (+ (x-point (start-segment line)) (x-point (end-segment line))) 2)
    (/ (+ (y-point (start-segment line)) (y-point (end-segment line))) 2)))

(print-pt (midpoint-segment (make-segment (make-point 0 0) (make-point 5 5))))




