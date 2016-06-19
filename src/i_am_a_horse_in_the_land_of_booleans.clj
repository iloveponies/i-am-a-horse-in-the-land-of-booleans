(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean
  "Returns false is x is nil or false, true otherwise"
  [x]
  (if x true false)
  )

(defn abs
  "Returns the absolute value of the entered value"
  [x]
  (if (< x 0) (* -1 x) x)
  )

(defn divides?
  "Returns true if divisor divides n, false otherwise"
  [divisor n]
  (if (== 0 (mod n divisor)) true false))

(defn fizzbuzz
  "The ultimate programming challenge of forever"
  [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""))

(defn teen?
  "Returns true if the entered age is in the teens,false otherwise"
  [age]
  (if (< 12 age 20) true false)
  )

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate
  "Does all kinds of whacky crap"
  [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true
    ))

(defn leap-year? [year]
  (cond
    (divides? 400 year) true
    (divides? 100 year) false
    (divides? 4 year) true
    :else false))

; '_______'

