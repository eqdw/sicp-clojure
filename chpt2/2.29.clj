(ns sicp.chpt2)

(defn make-mobile [left right]
  (list left right))

(defn make-branch [length structure]
  (list length structure))


;; For convenience
(defn pair? [pair]
  (and (list? pair) (== 2 (count pair)))
  )

(defn mobile? [mobile]
  (pair? mobile))


;; a. Write the corresponding selectors left-branch, right-branch, branch-length, branch-structure

(defn left-branch   [mobile] (first  mobile))
(defn right-branch  [mobile] (second mobile))

(defn branch-length    [branch] (first  branch))
(defn branch-structure [branch] (second branch))

;; needs be defined after branch-strucutre
(defn terminal? [branch]
  (number? (branch-structure branch)))

;; b. define a procedure total-weight

(defn total-weight [mobile]
  (let [ left  (left-branch  mobile)
         right (right-branch mobile) ] 
    (+
      (if (terminal? left)
        (branch-structure left)
        (total-weight (branch-structure left)))
      (if (terminal? right)
        (branch-structure right)
        (total-weight (branch-structure right)))
      )
    )
  )


;; c. A mobile is balanced if the torque (length * weight) of its left and right branches are equal
;;    write (balanced?)

(defn branch-weight [branch]
  (if (terminal? branch)
    (branch-structure branch)
    (total-weight (branch-structure branch))))

(defn torque [branch]
  (let [ weight (branch-weight branch)
         length (branch-length branch) ]
    (* weight length)))
       
(defn balanced? [mobile]
  (let [ left  (left-branch  mobile)
         right (right-branch mobile) ]
    (and (== (torque left) (torque right))
         (if (terminal? left) ;; left balanced?
             true
             (balanced? (branch-structure left))) 
         (if (terminal? right) ;; right balanced?
             true
             (balanced? (branch-structure right)))
         )))


;; d. if we change the constructors from using list to using cons, how do I change the rest
;;    of my app?

;; I'll do it later
;;
