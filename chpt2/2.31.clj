(ns sicp.chpt2)

(defn tree-map [tree func]
  (map (fn [subtree] 
         (if (list? subtree)
           (tree-map subtree func)
           (func subtree)))
       tree)

  )
