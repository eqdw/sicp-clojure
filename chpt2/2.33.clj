(ns sicp.chpt2)

;; def accumulate
;; It's like enumerable#reduce (or inject if you're everyone-but-me)

(defn accumulate [combiner initial sequence-]
  (if (empty? sequence-)
    initial
    (combiner
      (first sequence-)
      (accumulate combiner initial (rest sequence-)))))


;; (define (map p sequence) (accumulate (lambda (x y) <??>) nil sequence))


(defn map- [func seq-]
  (accumulate (fn [x y] (cons (func x) y)) '() seq-))


;; (defnine (append seq1 seq2) (accumulate cons <??> <??>))
(defn append- [seq1 seq2]
  (accumulate cons seq2 seq1)) 


;; (define (length sequence) (accumulate <??> 0 sequence))
(defn length [seq-]
  (accumulate (fn [x y] (+ 1 y)) 0 seq-))
