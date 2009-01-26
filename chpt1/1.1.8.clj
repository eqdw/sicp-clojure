(ns sicp.chpt1)

(defn average [x y]
  (/ (+ x y) 2))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn square [x]
  (* x x))

(defn improve [guess x]
  (/ (+ (/ x (square guess)) (* 2 guess)) 3))

(defn good-enough? [guess x]
  (< (/ (abs (- guess (improve guess x))) guess) 0.00001))

(defn cbrt-iter [guess x]
  ( if (good-enough? guess x)
    guess
    (cbrt-iter (improve guess x) x)))

(defn cbrt [x]
  (cbrt-iter 1.0 x))


(cbrt 8)