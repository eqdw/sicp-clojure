(ns sicp.chpt1)

;;I swear this question is straight out of TAoCP

;;Ackermann's Function
(defn A [x y]
  (cond
   (= y 0) 0
   (= x 0) (* 2 y)
   (= y 1) 2
   true (A (- x 1) (A x (- y 1)))))

;;(A 1 10)
;;(A 0 (A 1 9))
;;...
;;(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 1))))))))))
;;(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 2)))))))))
;;(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 4))))))))
;;(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 8)))))))
;;...
;;1024

;;(A 2 4)
;;(A 1 (A 2 3))
;;(A 1 (A 1 (A 2 2)))
;;(A 1 (A 1 (A 1 (A 2 1))))
;;(A 1 (A 1 (A 1 2)))
;;(A 1 (A 1 (A 0 (A 1 1))))
;;(A 1 (A 1 (A 0 2)))
;;(A 1 (A 1 4))
;;(A 1 (A 0 (A 1 3)))
;;(A 1 (A 0 (A 0 (A 1 2))))
;;(A 1 (A 0 (A 0 (A 0 (A 1 1)))))
;;(A 1 (A 0 (A 0 (A 0 2))))
;;(A 1 (A 0 (A 0 4)))
;;(A 1 (A 0 8))
;;(A 1 16)
;;(A 0 (A 1 15))
;;...
;;65536

;;(A 3 3)
;;(A 2 (A 3 2))
;;(A 2 (A 2 (A 3 1)))
;;(A 2 (A 2 2))
;;(A 2 (A 1 (A 2 1)))
;;(A 2 (A 1 2))
;;(A 2 (A 0 (A 1 1)))
;;(A 2 (A 0 2))
;;(A 2 4)
;;See above: 65536

(defn f [n]
     (A 0 n))
;;2n


(defn g [n]
     (A 1 n))
;;2^n

(defn h [n]
     (A 2 n))
;;2^^n



(defn k "5n^2" [n]
     (* 5 n n))

