(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))
;if boolean is x return true else return false

(defn abs [x]
  (if (> x 0) x (- x)))
;if x is > 0 return its value else return its opposite

(defn divides? [divisor n]
  (if (== 0 (mod n divisor)) true false))
;if the divisor divides n evenly (mod evaluates to 0)
;return true else false

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))
;return "gotcha!" if n is divisible by 15, "fizz" if n
;is divisible by 3, and "buzz" if n is divisible by 5,
;otherwise return an empty string

(defn teen? [age]
  (if (< 12 age 20) true false))
;if 12 < age and age < 20 return true else return false

(defn not-teen? [age]
  (not (teen? age)))
;if previously defined teen? function evaluates to true
;return false else return true

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))
;double x if x is a number, return nil if x is an empty
;collection, and double length of x if x is a list or a
;vector, otherwise return true

(defn leap-year? [year]
  (cond
   (divides? 400 year) true
   (and (divides? 4 year) (not (divides? 100 year))) true
   :else false))
;if the year is divisibile by 400 and 4, but not by 100
;return true, otherwise return false

; '_______'
