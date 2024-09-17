(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))


;; Ex 1
;; Implement (boolean x), which works like the built-in boolean function: for nil and false, it returns false, and for all other values it returns true. You can use if in its implementation, but not the build-in boolean.

(defn boolean [x]
  (if x true false))


;; Ex 2
;; Write the function (teen? age), which returns truthy if age is at least 13 and at most 19. Use only one comparison operator and give it three arguments.

(defn teen? [age]
  (<= 13 age 19))


;; Ex 3
;; Write the function (abs n), which returns the absolute value of n, i.e. if n<0n<0, the value of (abs n) is −n−n, and otherwise nn.

(defn abs [x]
  (if (< x 0) (- x) x))


;; Ex 4
;; Write the function (divides? divisor n), which returns true if divisor divides n and false otherwise.
;; (mod num div) returns 0 if div divides num exactly:

(defn divides? [divisor n]
  (= 0 (mod n divisor)))


;; Ex 5
;; Write the function (fizzbuzz n) that returns
;; "fizz" when n is divisible by 3,
;; "buzz" when n is divisible by 5,
;; "gotcha!" when n is divisible by 15, and
;; the empty string "" otherwise.
;; Use the divides? function from the previous exercise.

(defn fizzbuzz [n]
  (cond
    (divides? n 15) "gotcha!"
    (divides? n 3)  "fizz"
    (divides? n 5)  "buzz"
    :else ""))


;; Ex 6
;; Write a function (generic-doublificate x) that takes one argument and
;; doubles it if it is a number,
;; returns nil if it is an empty collection,
;; if it is a list or a vector, returns two times the length of it
;; returns true otherwise.
;; You can use the following functions:
;; (number? n) returns true if n is a number.
;; (empty? coll) returns true if coll is empty.
;; (list? coll) and (vector? coll) test if coll is a list or a vector.
;; (count coll) returns the length of a list or a vector.

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (and (coll? x) (empty? x)) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))


;; Ex 7
;; Write the function (not-teen? age), which returns true when teen? returns false and false otherwise.

(defn not-teen? [age]
  (not (teen? age)))


;; Ex 8
;; Write the function (leap-year? year), which returns true if year is a leap year, otherwise false. A year is a leap year if it is divisible by 4, except if it is divisible by 100, in which case it still is a leap year if it is divisible by 400.
;; See Wikipedia for a simple pseudocode solution.

(defn leap-year? [year]
  (cond
  (not= 0 (mod year 4)) false
  (not= 0 (mod year 100)) true
  (not= 0 (mod year 400)) false
  :else true  ))

 '_______'


