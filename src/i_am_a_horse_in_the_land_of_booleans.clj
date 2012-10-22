(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
    (- x)
	x
    ))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
  	(divides? 15 n) "gotcha!"
   	(divides? 5 n) "buzz"
   	(divides? 3 n) "fizz"
   	:else 			""))

(defn teen? [age]
  (if age (< 12 age 20)))

(defn not-teen? [age]
  (if (teen? age) false true))

(defn generic-doublificate [x]
  (cond
  	(number? x) (* x 2)
    (empty? x) nil
  	(vector? x) (* (count x) 2)
   	(list? x) (* (count x) 2)
   	:else true
   ))

(defn leap-year? [year]
  (cond
	(divides? 400 year) true
   	(divides? 100 year) false
   	(divides? 4 year) true
   	:else false
   ))