(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
  	(* x -1)
  	x))

(defn divides? [divisor n]
  (zero? (mod n divisor))

(defn fizzbuzz [n]
  (cond
  	(zero? (mod n 3))  "fizz"
  	(zero? (mod n 5))  "buzz"
  	(zero? (mod n 15)) "gotcha!"
  	:else              ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
	(cond
		(number? x)  (+ x x)
		(empty? x)	nil
		(list? x)	(* (count x) 2)
		(vector? x)	(* (count x) 2)
		:else true))

(defn leap-year? [year]
  (or 
    (and (zero? (mod year 4)) (> (mod year 100) 0)) 
    (and (zero? (mod year 400)) (> (mod year 100) 0))))

; '_______'
