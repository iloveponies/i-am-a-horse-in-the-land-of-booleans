(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (== 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides?  5 n) "buzz"
   (divides?  3 n) "fizz"
   :else ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate
  "doubles it if it is a number,
  returns nil if it is an empty collection,
  if it is a list or a vector, returns two times the length of it
  returns true otherwise."
  [x]
  (cond
   (number? x) (* 2 x)
   (empty?  x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (cond
   (divides? 400 year) true
   (divides? 100 year) false
   (divides?   4 year) true
   :else false))

; '_______'
