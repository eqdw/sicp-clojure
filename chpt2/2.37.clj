(ns sicp.chpt2)



;;One of these days I'll learn how to pull this into a separate common file

(defn accumulate [combiner initial data]
  (if (empty? data)
    initial
    (combiner
      (first data)
      (accumulate combiner initial (rest data)))))

(defn accumulate-n [combiner initial data]
    (if (empty? (first data))
          '()
          (cons (accumulate combiner initial (map first data)))))

;; MATRICES!


(defn dot-product [v w]
  (accumulate + 0 (map * v w)))



;; convert ((1 2 3) (4 5 6) (7 8 9)) => ((1 4 7) (2 5 8) (3 6 9))
(defn transpose [mat]
  (accumulate-n cons '() mat))

;; test
(def transpose-test '((1 2 3) (4 5 6) (7 8 9)))
(println "Should be ((1 4 7) (2 5 8) (3 6 9)): " (transpose transpose-test))

(defn matrix-*-vector [m v]
  (map 
    (accumulate + 0 )
    m))

;(defn matrix-*-matrix [m n]
  ;(let [cols (transpose n)]
    ;(map <??> m)))

