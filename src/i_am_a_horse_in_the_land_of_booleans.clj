(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn
  boolean
  "Takes one parameter and returns true for everything but nil and false values."
  [x]
  (if x true false))

(defn
  abs
  "takes one parameter and returns absolute value of that parameter"
  [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn
  divides?
  "Takes two parameters divisor and n and returns true if divisor devides n and false othervise."
  [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""))

(defn
  teen?
  "takes one parameter age and returns true if age is at least 13 and at most 19"
  [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (and (divides? 4 year) (or (not (divides? 100 year)) (divides? 400 year))))

; '_______'
