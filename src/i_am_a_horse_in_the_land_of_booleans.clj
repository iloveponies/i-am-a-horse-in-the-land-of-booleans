(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean "Works like built-in boolean function." [x]
  (if x true false))

(defn abs "Returns absolute value of x." [x]
  (if (< x 0) (* x -1) x))

(defn divides? "Returns true, if n divisor divides n." [divisor n]
  (if (== 0 (mod n divisor)) true false))

(defn fizzbuzz "Implementation of classic fizzbuzz." [n]
  (cond 
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? "Returns true, if age is between 13 & 19 (both included). " [age]
  (if (<= 13 age 19) true false))

(defn not-teen? "Returns true, if age is smaller than 13 or greater than 19." [age]
  (not (teen? age)))

(defn generic-doublificate "Generic doublificate function." [x]
  (cond
    (number? x) (* 2 x)
    (empty? x)  nil
    (list? x)   (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))

(defn leap-year? "Returns true if year is a leap year." [year]
  (cond
    (not (divides? 4 year)) false
    (not (divides? 100 year)) true
    (not (divides? 400 year)) false
    :else true))

; '_______'
