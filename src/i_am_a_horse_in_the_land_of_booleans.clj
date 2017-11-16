(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  "for nil and false, it returns false, and for all other values it returns true"
  (if (= x false)
    false
    (if (= x nil) 
      false
      true)))

(defn abs [x]
  "returns the absolute value of n, i.e. if (n < 0), the value of (abs n) is (-n), and otherwise (n)"
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  "returns true if divisor divides n and false otherwise"
    (if (= 0 (mod n divisor))
      true
      false))

(defn fizzbuzz [n]
  "returns
    \"fizz\" when n is divisible by 3,
    \"buzz\" when n is divisible by 5,
    \"gotcha!\" when n is divisible by 15, and
    the empty string \"\" otherwise."
    (cond 
      (divides? 15 n) "gotcha!"
      (divides? 3 n) "fizz"
      (divides? 5 n) "buzz"
      :else ""))
  
(defn teen? [age]
  "returns truthy if age is at least 13 and at most 19"
  (<= 13 age 19))

(defn not-teen? [age]
  "returns true when teen? returns false and false otherwise"
    (not (teen? age)))


(defn generic-doublificate [x]
  "doubles it if it is a number,
   returns nil if it is an empty collection,
   if it is a list or a vector, returns two times the length of it
   returns true otherwise."
  (cond
    (number? x) (+ x x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
  :else true))


(defn leap-year? [year]
  "returns true if year is a leap year, otherwise false. A year is a leap year if it is divisible by 4, except if it is divisible by 100, in which case it still is a leap year if it is divisible by 400"
    (cond
      (divides? 400 year) true
      (divides? 100 year) false
      (divides? 4 year) true
      :else false))
; '_______'
