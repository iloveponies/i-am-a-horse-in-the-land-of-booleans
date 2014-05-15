(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

;; Any -> Bool
;; Turns everything to boolean
(defn boolean [x]
  (if (or (nil? x) (= false x))
    false
    true))

;; Number -> Number
;; Return the absolute value
(defn abs [x]
  (if (< x 0)
    (- x)
    x))

;; Number -> Bool
;; Return True if divisible
(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

;; Exercise 5
;; Write the function (fizzbuzz n) that returns
;; "fizz" when n is divisible by 3,
;; "buzz" when n is divisible by 5,
;; "gotcha!" when n is divisible by 15, and
;; the empty string "" otherwise.
;; Use the divides? function from the previous exercise.
(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides?  3 n) "fizz"
   (divides?  5 n) "buzz"
   :else ""))

;; Number -> Bool
;; Check if the age is in the teenager range
(defn teen? [age]
  (if (and (>= age 13) (<= age 19))
    true
    false))

;; Number -> Bool
(defn not-teen? [age]
  (not (teen? age)))


;; Exercise 6
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


;; Number -> Bool
;; Check leap years
;; Exercise 8
;; Write the function (leap-year? year), which returns true if year is a leap year, otherwise false. A year is a leap year if it is divisible by 4, except if it is divisible by 100, in which case it still is a leap year if it is divisible by 400.
;; See Wikipedia for a simple pseudocode solution.
;; (leap-year? 100) ;=> false
;; (leap-year? 200) ;=> false
;; (leap-year? 400) ;=> true
;; (leap-year? 12)  ;=> true
;; (leap-year? 20)  ;=> true
;; (leap-year? 15)  ;=> false
(defn leap-year? [year]
  (cond
   (divides? 400 year) true
   (divides? 100 year) false
   (divides?   4 year) true
   :else false))

; '_______'
