(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (neg? x)
    (- x)
    x))

(defn divides? [divisor n]
  (zero? (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3  n) "fizz"
    (divides? 5  n) "buzz"
    :else          ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn list-or-vector? [x]
  (or (list?   x) (vector? x)))

(defn generic-doublificate [x]
  (cond
    (number?         x) (* 2 x)
    (empty?          x) nil
    (list-or-vector? x) (* 2 (count x))
    :else               true))

(defn leap-year? [year]
  ":(")

;(i-am-a-horse-in-the-land-of-booleans/abs 123)
; '_______'
