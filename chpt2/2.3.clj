(ns sicp.chpt2)

(def car first)

(def cdr rest)

(defn make-point [x y]
  (cons x y '()))

(defn x-point [pt]
  (car pt))

(defn y-point [pt]
  (cdr pt))

(defn make-segment [pt ptt]
  (cons pt ptt '()))

(defn segment-length [ln]
  (let [xlen (- (x-point (start-segment ln)) (x-point (end-segment ln)))
        ylen (- (y-point (start-segment ln)) (y-point (end-segment ln)))]
    (. Math sqrt (+ (* xlen xlen) (* ylen ylen)))))


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




;;makes a rectange from the top-left pt, the width and length
;;Note that, while significantly more efficient, this does not allow for a rectangle with
;;sides not parallel to the x and y axes
(defn make-rect-1 [pt len wid]
  (cons pt (list len wid)))

(defn top-left-pt [rect]
  (first rect))

(defn len-1 [rect]
  (first (rest rect)))

(defn wid-1 [rect]
  (rest (rest rect)))

(defn perim-1 [rect]
  (+ (* 2 (len-1 rect)) (* 2 wid-1 rect)))


(defn area-1 [rect]
  (* (len-1 rect) (wid-1 rect)))


;;Second representation. Uses two orthogonal lines. Takes more space but
;;allows rotated rectangles

(defn make-rect-2 [ln1 ln2]
  (list ln1 ln2))

(defn len-2 [rect]
  (segment-length (first rect)))

(defn wid-2 [rect]
  (segment-length (rest rect)))

(defn perim-2 [rect]
  (+ (* 2 (len-2 rect)) (* 2 (wid-2 rect))))


(defn area-2 [rect]
  (* (len-2 rect) (wid-2 rect)))
