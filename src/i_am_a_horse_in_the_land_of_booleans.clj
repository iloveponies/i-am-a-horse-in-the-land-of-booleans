(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (> x 0)
    x
    (* -1 x)))

(defn divides? [divisor n]
  (== 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n)  "buzz"
    (divides? 3 n)  "fizz"
    :else           ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn double-it [x]
  (* 2 x))

(defn generic-doublificate [x]
  (cond
    (number? x) (double-it x)
    (empty?  x) nil
    (list?   x) (double-it (count x))
    (vector? x) (double-it (count x))
    :else          true))

(defn leap-year? [year]
  (cond
    (divides? 400 year) true
    (divides? 100 year) false
    (divides? 4   year) true
    :else          false))
