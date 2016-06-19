(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< 0 x) x (- x)))

(defn divides? [divisor n]
  (integer? (/ n divisor)))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (integer? x) (* 2 x)
    (if (or (map? x) (vector? x) (list? x)) (empty? x)) nil
    (or (vector? x) (list? x)) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (or (and (divides? 4 year) (not (divides? 100 year))) (divides? 400 year)))

; '_______'
