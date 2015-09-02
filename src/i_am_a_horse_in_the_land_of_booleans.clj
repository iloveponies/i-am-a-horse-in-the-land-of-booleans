(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (* -1 x) x))

(defn divides? [divisor n]
  (if (= (mod divisor n) 0) true false))

(defn fizzbuzz [n]
  (cond 
   (divides? n 15) "gotcha" 
   (divides? n 3) "fizz" 
   (divides? n 5) "buzz" 
   :else ""))


(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  (cond
   (divides? year 400) true
   (divides? year 100) false
   (divides? year 4) true
   :else false))

; '_______'
