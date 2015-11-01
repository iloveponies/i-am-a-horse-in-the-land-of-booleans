(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if x true false))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (== (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n)  "buzz"
   (divides? 3 n)   "fizz"
   :else          ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (or (not (teen? age)) false))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x)  nil
   (list? x)   (* 2 (count x))
   (vector? x) (* 2 (count x))
   :else       true))

(defn leap-year? [year]
  ; A year is a leap year if it is divisible by 4,
  ; except if it is divisible by 100, in which case it
  ; still is a leap year if it is divisible by 400.
  (if (divides? 4 year)
    (if (not (divides? 100 year))
      true
      (divides? 400 year))
    false))


; '_______'
