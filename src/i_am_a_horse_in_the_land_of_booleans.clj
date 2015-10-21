(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (< x 0) 
    (- x) 
    (+ x)))

(defn divides? [divisor n]
  (== 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (divides? 15  n) "gotcha!"
    (divides? 5  n)  "buzz"
    (divides? 3 n)   "fizz"
    :else            ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  "doubles it if it is a number"
  "returns nil if it is an empty collection"
  "if it is a list or a vector, returns two times the length of it"
  "returns true otherwise"
  (cond
    (number? x)   (* x 2)
    (empty? x)    nil
    (or (list? x) (vector? x))   (* (count x) 2)
    :else         true
))

(defn leap-year? [year]
  (if (or (and (divides? 4 year) (not (divides? 100 year))) (divides? 400 year))
      true
      false))

; '_______'
