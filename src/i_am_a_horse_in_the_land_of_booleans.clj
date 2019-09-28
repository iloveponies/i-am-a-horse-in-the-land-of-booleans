(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (<= 0 x) x (- x)))

(defn divides? [divisor n]
  (== (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? [age]
  (if (<= 13 age 19) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (list? x) (vector? x)) (* (count x) 2)
    :else true))

(defn leap-year? [year]
  (cond
    ; Is a leap year if dividable by 4, 100 and 400 years
    (and (divides? 4 year) (divides? 100 year) (divides? 400 year)) true
    ; Is a leap year if dividable by 4 years, unless also dividable by 100 years
    ; but not by 400 years
    (and (divides? 4 year) (not (divides? 100 year))) true
    :else false))

; '_______'
