(ns sicp.chpt2)

(defn accumulate [combiner initial data]
    (if (empty? data)
          initial
          (combiner
                  (first data)
                  (accumulate combiner initial (rest data)))))

(defn accumulate-n [combiner initial data]
  (if (empty? (first data))
    '()
    (cons (accumulate combiner initial (map first data))
          (accumulate-n combiner initial (map rest data)))))



;;test 
(def data '((1 2 3) (4 5 6) (7 8 9) (10 11 12)))

(println "Should be (22 26 30): " (accumulate-n + 0 data))
