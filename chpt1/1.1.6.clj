(ns sicp.chpt1)


;;Since if is a macro, it evaluates the if form on a level above the evaluation
;;of its arguments. However, since the new-if is a function, it evaluates all
;;of its arguments. This would cause an infinite recursion in the example given