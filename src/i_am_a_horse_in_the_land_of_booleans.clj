(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides?  5 n) "buzz"
    (divides?  3 n) "fizz"
    :else           ""))

(defn teen? [age]
  (if (< 12 age 20) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn twice [x]
  (+ x x))

(defn generic-doublificate [x]
  (cond
      (number? x) (twice x)
      (empty?  x) nil
      (list?   x) (twice (count x))
      (vector? x) (twice (count x))
      :else       true))

(defn leap-year? [year]
  (cond
      (divides? 400 year) true
      (divides? 100 year) false
      (divides?   4 year) true
      :else               false))

; '_______'
