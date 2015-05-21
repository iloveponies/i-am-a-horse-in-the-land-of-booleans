(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
 (if (or(= x false) (= x nil)) false true)
  )

(defn abs [x]
 (if (< x 0) x x)
 )

(defn divides? [divisor n]
 
 (if (=(mod divisor n) 0) true false) 
 )

(defn fizzbuzz [n]
  ":(")

(defn teen? [age]
  (if (<= 13 age 19) true false)
  )

(defn not-teen? [age]
  (if (<= 13 age 19) false true)
  )

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
 
(if (not= (mod year 4) 0) false 
(if (not=(mod year 100) 0) true 
(if (not= (mod year 400) 0) false true) ) )

 )

; '_______'
