(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  "Simulates built-in boolean"
  [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (== (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else          ""))

(defn teen? [age]
  "which returns truthy if age is at least 13 and at most 19."
  [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
  (number? x) (* x 2)
  (empty? x) nil
  (list? x) (* 2 (count x))
  (vector? x) (* 2 (count x)) ; not using or - because the section comes after this exercise
  :else     true))

(defn leap-year? [year]
  (cond
    (and (divides? 100 year) (divides? 400 year)) true
    (divides? 100 year) false
    (divides? 4 year) true
    :else        false))

; '_______'

