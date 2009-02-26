(ns sicp.chpt2)

(defn else [] true)

(defn make-interval [a b]
  (list a b))

(defn upper-bound [int]
  (second int))

(defn lower-bound [int]
  (first int))

(defn add-interval [x y]
  (make-interval (+ (lower-bound x) (lower-bound y))
                 (+ (upper-bound x) (upper-bound y))))

;;Question 2.8

(defn sub-interval [x y]
  (make-interval (- (lower-bound x) (upper-bound y))
                 (- (upper-bound x) (lower-bound y))))


;;Question 2.9

;;say we have two intervals, N = (a b) and M = (c d)
;;
;;Width of N is (/ 2 (- b a))
;;Width of M is (/ 2 (- d c))
;;
;;If added together, we get ( (+ a b) (+ c d))
;;Width of N + M is (/ 2 (- (+ c d) (+ a b)))
;;Is ((c + d) - (a + b)) / 2
;;Is ( (c + d)/2 +  (-a - b)/2
;;
;;Dammit I'm not a math student. I'm not doing a friggin proof. It's obvious
;;to anyone who's taken any stats or done any error calculations EVEr

;;Question 2.10

(defn mul-interval [x y]
  (let [p (* (lower-bound x) (lower-bound y))
        q (* (lower-bound x) (upper-bound y))
        r (* (upper-bound x) (lower-bound y))
        s (* (upper-bound x) (upper-bound y))]
    (make-interval (min p q r s) (max p q r s))))

(mul-interval (make-interval 3 5) (make-interval 2 5))




(defn div-interval [x y]
  (if (= (lower-bound y) (upper-bound y))
    (println "Divide by a zero interval. DON'T DO THAT DUMBASS!")
    (mul-interval x
                (make-interval (/ 1.0 (upper-bound y))
                               (/ 1.0 (lower-bound y))))))


;;Exercise 2.11
;;
;;++ ++ => (2 3)*(2 3) ====>(l*l) (r*r) ===> ((* 2 2) (* 3 3))  ==> (4 9)
;;++ +- => (2 3)*(-2 3) ===>(r*l) (r*r) ===> ((* 3 -2) (* 3 3)) ==> (-6 9)
;;++ -- => (2 3)*(-3 -2) ==>(r*l) (l*r) ===> ((* 3 -3) (* 2 -2)) => (-9 -4)
;;+- ++ => (-2 3)*(2 3) ===>(l*r) (r*r) ===> ((* -2 2) (* 3 3)) ==> (-4 9)
;;+- +- => (-2 3)*(-2 4) ==>(min, max) ====> cond
;;+- -- => (-2 3)*(-3 -2) =>(r*l) (l*r) ===> ((* 3 -3) (* -2 -3)) => (-9, 6)
;;-- ++ => (-3 -2)*(2 3) ==>(l*r) (r*l) ===> ((* -3 3) (* -2 2)) ==> (-9 -4)
;;-- +- => (-3 -2)*(-2 3) =>(l*r) (l*l) ===> ((* -3 3) (* -3 -2)) => (-9 6)
;;-- -- => (-3 -2)*(-3 -2)=>(r*r) (l*l) ===> ((* -2 -2) (* -3 -3))=> (4 9)

(defn null? [x] (= x '()))

(defn positive? [x]
  (> x 0))
(defn negative? [x]
  (< x 0))

(defn mul-interval-v2 [x y]
  (let [lx (lower-bound x) ux (upper-bound x)
        ly (lower-bound y) uy (upper-bound y)]
    (cond (and (positive? ux) (positive? uy) (positive? lx) (positive? ly))
          (make-interval (* lx ly) (* ux uy))
          (and (positive? lx) (negative? ly) (positive? ux) (positive? uy))
          (make-interval (* ux ly) (* ux uy))
          (and (positive? lx) (negative? ly) (positive? ux) (negative? uy))
          (make-interval (* ux ly) (* lx uy))
          (and (negative? lx) (positive? ly) (positive? ux) (positive? uy))
          (make-interval (* lx uy) (* ux uy))
          (and (negative? lx) (negative? ly) (positive? ux) (negative? uy))
          (make-interval (* ux ly) (* lx uy))
          (and (negative? lx) (positive? ly) (negative? ux) (positive? uy))
          (make-interval (* lx uy) (* ux ly))
          (and (negative? lx) (negative? ly) (negative? ux) (positive? uy))
          (make-interval (* lx uy) (* lx ly))
          (and (negative? lx) (negative? ly) (negative? ux) (negative? uy))
          (make-interval (* ux uy) (* lx ly))
          (else)
          (let [p0 (* lx ly) p1 (* lx uy) p2 (* ux ly) p3 (* ux uy)]
            (make-interval (min p0 p1 p2 p3) (max p0 p1 p2 p3))))))


(mul-interval-v2 '(3 5) '(-2 5))


;;Question 2.12

(defn make-centre-percent [c p]
  (make-interval (- c (* c (/ p 100))) (+ c (* c (/ p 100)))))

(defn centre [i]
  (/ (+ (lower-bound i) (upper-bound i)) 2.0))

(defn percent [i]
  (* (/ (- (upper-bound i) (centre i)) (centre i)) 100.0))


;;Question 2.13

;;I'd rather not

;;Question 2.14

(defn par1 [r1 r2]
  (div-interval (mul-interval r1 r2)
                (add-interval r1 r2)))

(defn par2 [r1 r2]
  (let [one (make-interval 1 1)]
        (div-interval one
                      (add-interval (div-interval one r1)
                                    (div-interval one r2)))))

;;The wording of this question implies that the problem is floating-point error


;;Question 2.15

;;This question implies again that I was correct in my answer of question 2.14.
;;Computer science is an EXACT science (like math!) So I don't care



;;Question 2.16

;;Yes I can, but it has one shortcoming: We're restricting to the set of RATIONAL
;;numbers, not REAL numbers. By representing numbers as an *exact* value (in rational
;;N/D form), we will NOT introduce floating-point error. However, there are two
;;cons to this method. One: this prevents us from using irrational numbers, such as
;;pi (making doing circular geometry impossible); two: this requires exact measurement
;;of error, which is impossible in real-world scenarios
