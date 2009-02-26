(ns sicp.chpt2)

(defn atom? [x] (not (list? x)))

(defn else [] true)

(defn cons+ [x y]
  (if (atom? y) (cons x (list y))
      (cons x y)))

(defn fringe [tree]
  (cond (atom? tree) tree
        (empty? (rest tree)) (first tree)
        (else) (cons+ (fringe (first tree)) (fringe (rest tree)))))

(def xx (list (list 1 2) (list 3 4)))


