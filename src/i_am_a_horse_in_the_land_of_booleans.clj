(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (* x -1) x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (if (divides? 15 n) "gotcha!"
  	(if (divides? 3 n) "fizz"
  		(if (divides? 5 n) "buzz"
  			""))))

(defn teen? [age]
  (if (< age 13)
  	false
  	(if (> age 19) false
  		true)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (if (number? x) (* x 2)
  	(if (empty? x) nil
  		(if (list? x) (* (count x) 2)
  			(if (vector? x) (* (count x) 2)
  				true)))))

(defn leap-year? [year]
  (if (divides? 4 year)
  	(if (divides? 100 year)
  		(if (divides? 400 year)
  			true
  			false)
  		true)
  	false)
)

; '_______'
