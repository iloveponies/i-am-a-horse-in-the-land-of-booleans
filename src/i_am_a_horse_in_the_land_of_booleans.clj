(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
  (if x true false))

(defn abs 
  [x]
  (if (> x 0)
  x
  (- x)))

(defn divides? 
  [divisor n]
  (== 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
	(divides? 15 n) "gotcha!"
	(divides? 5 n) "buzz"
	(divides? 3 n) "fizz"
	:else ""
   ))

(defn teen? 
  [age]
  (and (< age 20) (> age 12)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
	(number? x) (* 2 x)
	(empty? x) nil
	(or (list? x) (vector? x)) (* 2 (count x))
	:else true
   ))

(defn leap-year? [year]
  (cond
   (and (divides? 100 year) (divides? 400 year)) true 
	(and (divides? 4 year) (not (divides? 100 year))) true
   :else false
  )
  )