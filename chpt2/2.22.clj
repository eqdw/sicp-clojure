(ns sicp.chpt2)


;;Well, the first way doesn't work because, by the nature of cons, you write it such that
;;(cons # x) where x is the recursion. In an iterative recursion, however, you are consing, and
;;then evaluating the cons before doing it again. So, long-story-short, you get it in reverse

;;Reversing the args doesn't help (I figured this out the hard way) because cons takes two
;;operands: a value, and a list. The second operand HAS to be a list. Because of this,
;;it is impossible to exchange arguments to cons and still expect it to work, without
;;modifying the base case in some way