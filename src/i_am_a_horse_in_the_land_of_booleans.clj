(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
  	(divides? 15 n) "gotcha!"
  	(divides? 3 n) "fizz"
  	(divides? 5 n) "buzz"
  	
  	:else ""))

(defn teen? [age]
  (= (>= age 13) (<= age 19)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
  	(number? x) (+ x x)
  	(empty? x) nil
  	(or (list? x) (vector? x)) (* 2 (count x))
  	:else true))

(defn leap-year? [year]
  (and 
  	(divides? 4 year)
  	(or (not(divides? 100 year)) (divides? 400 year))))

; '_______'
