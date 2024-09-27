(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if x true false))

(defn abs [x] (if (< x 0) (* -1 x) x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
   true
   false))

(defn fizzbuzz [n]
  (cond
  	(divides? 15 n) "gotcha!"
  	(divides? 3 n) "fizz"
  	(divides? 5 n) "buzz"
  	:else ""))

(defn teen? [age] (if (< 12 age 20) true false))

(defn not-teen? [age]
  (if (teen? age)
  	(and false false)
  	true))

(defn generic-doublificate [x]
  (if (number? x) (* 2 x)
  	(if (not (or (list? x) (vector? x) (= x {}))) true
  		(if (== (count x) 0) nil
  			(* 2 (count x))))))

(defn leap-year? [year]
  (if (not(== (mod year 100) 0))
  	(if(== (mod year 4) 0) true false)
  	(if(== (mod year 400) 0) true false)))

; '_______'
