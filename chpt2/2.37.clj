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
          (cons (accumulate   combiner initial (map first data))
                (accumulate-n combiner initial (map rest  data)))))

;; MATRICES!


(defn dot-product [v w]
  (accumulate + 0 (map * v w)))



;; convert ((1 2 3) (4 5 6) (7 8 9)) => ((1 4 7) (2 5 8) (3 6 9))
(defn transpose [mat]
  (accumulate-n list '() mat))

;; test
(def transpose-test '((1 2 3) (4 5 6) (7 8 9)))
(println "Should be ((1 4 7) (2 5 8) (3 6 9)): " (transpose transpose-test))


;; a reminder:
;; (
;;   (1 2 3) *  (3 2 1) => ( (1*3 + 2*2 + 3*1), (4*3 + 5*2 + 6*1), (7*3 + 8*2 + 9*1) )
;;   (4 5 6)
;;   (7 8 9)
;; )

(defn matrix-*-vector [m v]
  (map
    (fn [row] (dot-product row v))
    m))

;; test
(def m*v-mat '((1 2 3) (4 5 6) (7 8 9)))
(def m*v-vec '(3 2 1))

(println "Sould be (10 28 46): " (matrix-*-vector m*v-mat m*v-vec))

;(defn matrix-*-matrix [m n]
  ;(let [cols (transpose n)]
    ;(map <??> m)))

