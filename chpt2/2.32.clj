(ns sicp.chpt2)


(defn subsets [s]
  (if (empty? s)
    (list '())
    (let [therest (subsets (rest s))]
      (concat therest (map (fn [x] (cons (first s) x)) therest)))))


