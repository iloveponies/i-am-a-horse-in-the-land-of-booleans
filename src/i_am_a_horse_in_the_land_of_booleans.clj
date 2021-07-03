(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))


(defn boolean [x]
  "Exercise 1"
  (if x true false))


(defn abs [x]
  "Exercise 3"
  (if (< x 0)
    (- x)
    x))


(defn divides? [divisor n]
  "Exercise 4"
  (if (== 0 (mod n divisor)) true false))


(defn fizzbuzz [n]
  "Exercise 4"
  (cond
    (== 0 (mod n 15)) "gotcha!"
    (== 0 (mod n 3)) "fizz"
    (== 0 (mod n 5)) "buzz"
    :else ""))


(defn teen? [age]
  "Exercise 2, age is at least 13 and at most 19."
  (<= 13 age 19))


(defn not-teen? [age]
  "Exercise 7"
  (not (teen? age)))


(defn generic-doublificate [x]
  "Exercise 6"
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))


(defn leap-year? [year]
  "Exercise 8"
  (cond
    (not (== 0 (mod year 4))) false
    (not (== 0 (mod year 100))) true
    (not (== 0 (mod year 400))) false
    :else true))


; '_______'
