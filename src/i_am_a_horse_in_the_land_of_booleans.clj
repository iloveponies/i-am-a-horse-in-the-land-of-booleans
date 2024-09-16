(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (* -1 x) x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
  (divides? 15 n) "gotcha!"
  (divides? 5 n)  "buzz"
  (divides? 3 n)  "fizz"
  :else           ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
  (number? x) (* 2 x)
  (empty? x)  nil
  (list? x)   (* 2 (count x))
  (vector? x)   (* 2 (count x))
  :else       true))

(defn leap-year? [year]
  (cond
  (not (divides? 4 year))   false
  (not (divides? 100 year)) true
  (not (divides? 400 year)) false
  :else                     true))

; '_______'
