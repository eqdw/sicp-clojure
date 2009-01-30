(ns sicp.chpt1)

(defn abs [x]
  (if (< x 0)
    (- 0 x)
    x))


(defn cube [x]
  (* x x x))

(defn p [x]
  (println "p executed")
  (- (* 3 x) (* 4 (cube x))))


(defn sine [angle]
  (if (not (> (abs angle) 0.1))
    (angle)
    (p (sine (/ angle 3.0)))))

#'user/sine

(sine 12.15)

;;==>
;; p executed
;; p executed
;; p executed
;; p executed
;; p executed
;; -0.39980345741334

;;It appears to have been executed 5 times.



;;A cursory program trace seems to suggest that this sine approximation algorithm is
;;order O(n*lg n) in time and O(lg n) in space