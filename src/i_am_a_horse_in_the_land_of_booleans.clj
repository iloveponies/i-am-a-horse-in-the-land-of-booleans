(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
(if (or (= x nil) (= x false)) false true)  ; () around the false and true produce ERROR!!!
)

(defn abs [x]
(if (< x 0) (* -1 x) x )
)

(defn divides? [divisor n]
(if (== (mod n divisor) 0) true false)
)

(defn teen? [age]
(if (<= 13 age 19) true false)
)

(defn fizzbuzz [n]
(cond
(divides? 15 n) "gotcha!"
(divides?  3 n) "fizz"
(divides?  5 n) "buzz"
:else           ""
)
)

(defn generic-doublificate [x]
(cond
(number? x) (* 2 x)
(empty?  x) nil
(or (list? x) (vector? x)) (* 2 (count x))
:else       true
)
)

(defn not-teen? [age]
(if (teen? age) false true)
)


(defn leap-year? [year]
(if (and (divides? 100 year) (divides? 400 year))
     true
     (if (and (not (divides? 100 year)) (divides? 4 year)) true false)
)
)


; '_______'
