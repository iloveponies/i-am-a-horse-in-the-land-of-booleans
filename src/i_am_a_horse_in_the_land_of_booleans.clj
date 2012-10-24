(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
  (if (= x nil) false (if (= x false) false true)))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
   	(divides? 15 n) "gotcha!"
   	(divides? 5 n) "buzz"
   	(divides? 3 n) "fizz"
   	:else ""
  ))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (if (not (teen? age)) true false))

(defn generic-doublificate [x]
  (cond
   	(number? x) (* 2 x)
   	(empty? x) nil
   	(or (vector? x) (list? x)) (* 2 (count x))
   	:else true
  ))

(defn leap-year? [year]
  (and (divides? 4 year) 
       (if (divides? 100 year) (divides? 400 year) true)))