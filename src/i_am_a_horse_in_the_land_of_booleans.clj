(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn
  boolean
  "Converts arguments into boolean."
  [x]
  (if (= x nil)
    false
    (if (= x false)
      false
      true)))

(defn
  abs
  "Returns the absolute value of x"
  [x]
  (if (< x 0) (- x) x))

(defn
  divides?
  "Returns true if divisor divides n and false otherwise."
  [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn
  fizzbuzz
  "returns \"fizz\" when n is divisible by 3, \"buzz\" when n is divisible by 5, \"gotcha!\" when n is divisible by 15, and the empty string \"\" otherwise."
  [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""))

(defn
  teen?
  "Returns truthy if age is at least 13 and at most 19."
  [age]
  (if (<= 13 age 19) true false))

(defn
  not-teen?
  "returns true when teen? returns false and false otherwise."
  [age]
  (not (teen? age)))

(defn
  generic-doublificate
  "Function takes one argument and doubles it if it is a number, returns nil if it is an empty collection, if it is a list or a vector, returns two times the length of it returns true otherwise."
  [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))

(defn
  leap-year?
  "returns true if year is a leap year, otherwise false."
  [year]
  (cond
    (divides? 400 year) true
    (divides? 100 year) false
    (divides? 4 year) true
    :else false))

; '_______'
