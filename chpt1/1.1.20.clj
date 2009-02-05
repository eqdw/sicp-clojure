(ns sicp.chpt1)

(defn gcs [a b]
  (if (= b 0)
    a
    (gcd b (rem a b))))

;;Applicative Order
;;
;;(gcd 206 40)
;;eval 206 and 40, then apply gcd
;;(gcd 206 40)
;;(gcd 40 (rem 206 40))
;;eval 40 and (rem 206 40), then apply gcd
;;(gcd 40 6)
;;(gcd 6 (rem 40 6))
;;eval 6, (rem 40 6), then apply gcd
;;(gcd 6 4)
;;(gcd 4 (rem 6 4))
;;eval 4, (rem 6 4), then apply gcd
;;(gcd 4 2)
;;(gcd 2 (rem 4 2))
;;eval 2, (rem 4 2), then apply gcd
;;(gcd 2 0)
;;2
;;4 Rem's performed

;;Normal order
;;
;;(gcd 206 40)
;;expand
;;(gcd 40 (rem 206 40))
;;expand
;;(gcd (rem 206 40) (rem 40 (rem 206 40)))
;;...
;;I get it. Normal order = bad.

