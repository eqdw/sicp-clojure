(ns sicp.chpt1)


(defn first-denom [k]
  (cond (= kind 1) 1
        (= kind 2) 5
        (= kind 3) 10
        (= kind 4) 25
        (= kind 5) 100
        (= kind 6) 200))

(defn cc [amt kinds]
  (cond (= amt 0) 1
        (or (< amt 0) (= kinds 0)) 0
        (+ (cc amt (- kinds 1)) (cc (- amt (first-denom kinds)) kinds))))

(defn change [amt]
  (cc amt 6))


;;(change 11)
;;
;;(cc 11 6)
;;(+ (cc 11 5) (cc -189 6))
;;(+ (+ (cc 11 4) (cc -89 5)) 0)
;;(+ (+ (cc 11 3) (cc -14 4) 0) 0)
;;(+ (+ (+ (cc 11 2) (cc 1 3)) 0) 0)
;;(+ (+ (+ (+ (cc 11 1) (cc 1 2)) (+ (cc 1 2) (cc -9 3)))))
;;(+ (+ (+ (+ (+ (cc 11 0) (cc 10 1)) (+ (cc 1 1) (cc -4 2))))))
;;...
;;This function grows similarily to the recursive fibbonaci numbers. Which is to say, it is
;;O(lg n) in space, and 0(b^n) in time