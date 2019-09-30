(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean
  "Defines whether an expression is truthy or falsey"
  [x]
  (if x true false))

(defn abs
  "Returns the absolute value"
  [x]
  (if (< x 0) (* -1 x) x))

(defn divides?
  "Specifies whether the divisor divides n"
  [divisor n]
  (== (mod n divisor) 0))

(defn fizzbuzz
  "A Clojure fizzbuzz implementation"
  [n]
  (cond
   (divides? 15 n) "gotcha!"
    (divides? 3 n)  "fizz"
    (divides? 5 n)  "buzz"
    :else           ""))


(defn teen?
  "Specifies whether someone is a teenager"
  [age]
  (<= 13 age 19))

(defn not-teen?
  "Specifies whether someone is not a teenager"
  [age]
  (not (teen? age)))

(defn generic-doublificate
  "Does some complicated thing with expressions"
  [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (or (list? x) (vector? x)) (* (count x) 2)
   :else true))

(defn leap-year?
  "Specifies whether the year is a leap year"
  [year]
  (or
   (and
    (divides? 4 year)
    (not (divides? 100 year)))
   (divides? 400 year)))

; '_______'
