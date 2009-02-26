(ns sicp.chpt2)

(defn else [] true)

(defn parity-iter [pred rtn args]
  (cond (empty? args) rtn
        (pred (first args)) (recur pred (cons (first args) rtn) (rest args))
        (else) (recur pred rtn (rest args))))

(defn same-parity [& args]
  (if (even? (first args))
    (parity-iter even? '() args)
    (parity-iter odd? '() args)))
