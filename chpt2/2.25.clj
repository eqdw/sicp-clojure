(ns sicp.chpt2)




(def a '(1 3 (5 7) 9))

(def b '((7)))

(def c '(1 (2 (3 (4 (5 (6 7)))))))



;;A:
(first (rest (first (rest (rest a)))))

;;B:
(first (first b))

;;C:
(first (rest (first (rest (first (rest (first (rest (first (rest (first (rest c))))))))))))

