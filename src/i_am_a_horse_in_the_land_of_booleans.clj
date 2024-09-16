(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
 (if (or(= x false) (= x nil)) false true)
  )

(defn abs [x]
 (if (< x 0) (* x -1) x)
 )

(defn divides? [divisor n]
 
 (if (=(mod n divisor) 0) true false) 
 )

(defn fizzbuzz [n]
  
  (if (divides? 15 n) "gotcha!"
  (if (divides? 3 n) "fizz"
  (if (divides? 5 n) "buzz"
  ""  )))
)
(defn teen? [age]
  (if (<= 13 age 19) true false)
  )

(defn not-teen? [age]
  (if (<= 13 age 19) false true)
  )

  
 
(defn generic-doublificate [n]
 
 (cond
    (number? n) (+ n n) 
    (empty? n) nil
    (or (vector? n) (list? n)) (* (count n) 2)
	:else true)
	)
	
(defn leap-year? [year]
 
(if (not= (mod year 4) 0) false 
(if (not=(mod year 100) 0) true 
(if (not= (mod year 400) 0) false true) ) )

 )

; '_______'
