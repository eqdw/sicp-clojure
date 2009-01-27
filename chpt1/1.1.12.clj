(ns sicp.chpt1)

;;defines an infinite sequence. Lazy eval to the rescue! Also, either I don't understand this
;;question properly, or SICP expects us to have absorved Cons from the air or something

(defn pascals-triangle
  (triangle-recurse '(1)))

;;Recursively generates a list of lists, where each internal list
;;contains a row of Pascal's Triangle
(defn triangle-recurse [tri]
  ;;in The Little Schemer terms, this would appear to be a *-method. And it's late. :(
  )