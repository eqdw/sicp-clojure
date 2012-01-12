(ns sicp.chpt2)

(defn square [x] (* x x))

(defn square-tree [tree]
  (cond 
    (number? tree)
      (square tree)
    (empty? tree)
      '()
    :else
      (cons (square-tree (first tree)) (square-tree (rest tree)))))



(defn square-tree-map [tree]
  (map (fn [sub-tree]
         (if (list? sub-tree)
           (square-tree-map sub-tree)
           (square sub-tree)))
       tree)

  )
