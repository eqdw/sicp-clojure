(ns sicp.chpt1)


(defn -- [x]
  (- x 1))



;;Treats Pascal's Triangle as a function of two arguments n and r, where
;;n is the row and r is the column of the value. Ie, p(4, 2) == 3

(defn triangle [n r]
  (if (or (= r 1) (= n r))
    1
    (+ (triangle (-- n) (-- r)) (triangle (-- n) r))))


