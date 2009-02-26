(ns sicp.chpt2)



(defn first-denomination [coins]
  (first coins))

(defn except-first-denomination [coins]
  (rest coins))

(defn no-more? [coins]
  (empty? coins))

;;Of course order should not affect the answer, however it will affect the evolution
;;of the process

