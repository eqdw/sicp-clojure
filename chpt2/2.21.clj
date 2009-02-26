(ns sicp.chpt2)

(defn square [x] (* x x))

(defn sq-list-1 [items]
  (if (empty? items)
    nil
    (cons (square (first items)) (sq-list-1 (rest items)))))

(defn sq-list-2 [items]
  (map (fn [x] (* x x)) items))

