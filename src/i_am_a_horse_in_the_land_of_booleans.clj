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
   (divides? 3  n) "fizz"
   (divides? 5  n) "buzz"
   :else ""))

(defn teen? [age]
  (if (and (<= age 19) (>= age 13))
    true 
    false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [n]
  (cond
   (number? n) (* 2 n)
   (empty?  n) nil 
   (or (list? n)
       (vector? n)) (* 2 (count n))
   :else true))

(defn leap-year? [year]
  (cond 
   (not (divides? 4   year)) false
   (not (divides? 100 year)) true
   (not (divides? 400 year)) false
   :else true))
 
; '_______'
