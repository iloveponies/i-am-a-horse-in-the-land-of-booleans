(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean
  "Implement clojure.core boolean function"
  [x]
  (if x
    true
    false))

(defn abs
  "Return the absoluet value of n"
  [x]
  (if (< x 0)
    (- x)
    x))

(defn divides?
  "Returns true if divisor divides n, false otherwise"
  [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz
  "Returns 'fizz' when n divisible by 3, 'buzz' when divisible by 5,
  'gotcha!' when divisible by 15, and an empty string otherwise."
  [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n)  "fizz"
    (divides? 5 n)  "buzz"
    :else           ""))

(defn teen?
  "Return boolean of wether age entered represents a teenager"
  [age]
  (<= 13 age 19))

(defn not-teen?
  "Returns true when not-teen? is false, and vice versa"
  [age]
  (not (<= 13 age 19)))

(defn generic-doublificate
  "Returns double x if it is a number, nil if x is an empty collection, two time the length if x is a
  list or vector, otherwise returns true"
  [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))

(defn leap-year?
  "Returns true if leap year (divisible by 4 AND 100), else returns false"
  [year]
  (if (and (divides? 4 year) (or (not (divides? 100 year)) (divides? 400 year)))
    true
    false))

; '_______'

