(ns sicp.chpt2)


(list 1 (list 2 (list 3 4)))
;;
;;Interpreter result:
;;(1 (2 (3 4)))


;;box/ptr:

;;   1 .--> 2 .---> 3 ---> 4

;;tree

;;        . 
;;      /     \
;;     1     /    \
;;         2     / \
;;              3   4