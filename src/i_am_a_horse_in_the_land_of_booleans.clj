(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (* x -1) x))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor)) true false))

(defn fizzbuzz [n]
  (cond 
	(== 0 (mod n 15)) "gotcha!"
	(== 0 (mod n 5)) "buzz"
	(== 0 (mod n 3)) "fizz"
	:else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (cond   
	(not (<= 13 age 19)) true
	:else false
	))

(defn generic-doublificate [x]
  (cond (number? x) (* x 2)
	(empty? x) nil
	(or (list? x) (vector? x)) (* 2 (count x))
	:else true
	))

(defn leap-year? [year]
   (cond 
	(== 0 (mod year 400)) true 
	(== 0 (mod year 100)) false
	(== 0 (mod year 4)) true
	:else false	
	))

; '_______'
