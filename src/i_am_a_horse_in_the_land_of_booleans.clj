(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if x true false))

(defn abs [x] (if (< 0 x) x (* -1 x) ))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor)) true false))

(defn fizzbuzz [n]
  "fizzbuzz clojure style"
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn teen? [age]
  (if (< 12 age 20) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  "Write a function (generic-doublificate x) that takes one argument
and doubles it if it is a number, returns nil if it is an empty
collection, if it is a list or a vector, returns two times the length
of it returns true otherwise.
You can use the following functions:
(number? n) returns true if n is a number.
(empty? coll) returns true if coll is empty.
(list? coll) and (vector? coll) test if coll is a list or a vector.
(count coll) returns the length of a list or a vector. "
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  "Write the function (leap-year? year), which returns true if year is
a leap year, otherwise false. A year is a leap year if it is divisible
by 4, except if it is divisible by 100, in which case it still is a
leap year if it is divisible by 400."
  (cond
   (not (divides? 4 year)) false
   (not (divides? 100 year) ) true
   (not (divides? 400 year) ) false
   :else true) )

; '_______'
