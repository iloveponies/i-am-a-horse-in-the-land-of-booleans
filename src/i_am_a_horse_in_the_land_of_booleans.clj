(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn
  boolean
  "Own implementation of boolean function"
  [x]
  (if x
    true
    false))

(defn
  abs
  "returns the absolute value of n"
  [n]
  (if (< n 0)
    (- n) n))


(defn
  divides?
  [divisor n]
  (= 0 (mod n divisor)))

(defn
  fizzbuzz
  [n]
  (if (divides? 15 n )
    "gotcha!"
   (if (divides? 3 n)
    "fizz"
   (if (divides? 5 n)
    "buzz"
    ""))))


(defn
  teen?
  [age]
  (<= 13 age 19))

(defn
  not-teen?
  [age]
   (not (teen? age)))


(defn
  generic-doublificate
  [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   :else true))


(defn
  leap-year?
  [year]
  (cond
   (divides? 400 year) true
   (divides? 100 year) false
   (divides? 4 year) true
   :else false))


