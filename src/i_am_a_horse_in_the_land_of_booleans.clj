(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn
  boolean
  "For nil and false, it returns false, and for all other values it returns true"
  [x]
  (if x true false))

(defn
  abs
  "Returns the absolute value of n"
  [n]
  (if (< n 0) (* -1 n) n))

(defn
  divides?
  "Returns true if divisor divides n and false otherwise"
  [divisor n]
  (if (== (mod n divisor) 0) true false))

(defn
  fizzbuzz
  "Returns fizz when n is divisible by 3, buzz when by 5, gotcha! when by 15, empty otherwise."
  [n]
    (cond
     (divides? 15 n) "gotcha!"
     (divides? 5 n) "buzz"
     (divides? 3 n) "fizz"
     :else ""))

(defn
  teen?
  "Returns truthy if age is at least 13 and at most 19"
  [age]
  (if (and (> age 12) (< age 20)) true false))

(defn
  not-teen?
  "Returns true when teen? returns false and false otherwise"
  [age]
  (not (teen? age)))

(defn
  generic-doublificate
  "Does generic doubling duty fizzbanging"
  [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* (count x) 2)
   (vector? x) (* (count x) 2)
   :else true))

(defn
  leap-year?
  "Returns true if year is a leap year, otherwise false."
  [year]
  (if (or (and (== (mod year 4) 0) (not (== (mod year 100) 0)))
          (== (mod year 400) 0)) true false))

; '_______'
