(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean
  "for nil and false, it returns false, and for all other values it returns true. You can use if in its implementation, but not the build-in boolean."
  [x]
  (if x
    true
    false))

(defn abs
  "returns the absolute value of n, i.e. if n<0, the value of (abs n) is −n, and otherwise n."
  [x]
  (if (< x 0)
    (- x)
    x))

(defn divides?
  "returns true if divisor divides n and false otherwise. (mod num div) returns 0 if div divides num exactly"
  [divisor n]
  (== 0 (mod n divisor))
  )

(defn fizzbuzz
  "Write the function (fizzbuzz n) that returns
    \"fizz\" when n is divisible by 3,
    \"buzz\" when n is divisible by 5,
    \"gotcha!\" when n is divisible by 15,
    and the empty string \"\" otherwise.
  Use the divides? function from the previous exercise."
  [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else "")
  )

(defn teen?
  "returns truthy if age is at least 13 and at most 19. Use only one comparison operator and give it three arguments."
  [age]
  (if (<= 13 age 19)
    true
    false))

(defn not-teen?
  "returns true when teen? returns false and false otherwise."
  [age]
  (not (teen? age)))

(defn generic-doublificate
  "Write a function (generic-doublificate x) that takes one argument and
    doubles it if it is a number,
    returns nil if it is an empty collection,
    if it is a list or a vector, returns two times the length of it
    returns true otherwise.
  You can use the following functions:
    (number? n) returns true if n is a number.
    (empty? coll) returns true if coll is empty.
    (list? coll) and (vector? coll) test if coll is a list or a vector.
    (count coll) returns the length of a list or a vector."
  [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (or (list? x) (vector? x)) (* (count x) 2)
   :else true)
  )

(defn leap-year?
  "returns true if year is a leap year, otherwise false. A year is a leap year if it is divisible by 4, except if it is divisible by 100, in which case it still is a leap year if it is divisible by 400."
  [year]
  (and (divides? 4 year) (or (not (divides? 100 year)) (divides? 400 year))))

; '_______'
