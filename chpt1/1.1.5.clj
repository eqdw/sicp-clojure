(ns sicp.chpt1)

(defn p []
  (p))

(defn test [x y]
  (if (= x 0)
    0
    y))

(test 0 (p))

;;Executing this code in the REPL prompt generates a stack overflow. This means
;;that the REPL uses normal-order evaluation. If it used applicative-order
;;evaluation, then test would return 0 without ever applying (p)