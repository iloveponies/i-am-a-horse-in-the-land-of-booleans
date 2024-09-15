(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n)  "buzz"
    (divides? 3 n)  "fizz"
    :else           ""))

(defn teen? [age]
  (if (<= 13 age 19) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x)  nil
    (list? x)   (* (count x) 2)
    (vector? x) (* (count x) 2)
    :else       true))

(defn leap-year? [year]
  (cond
    (not (= (mod year 4) 0)) false
    (not (= (mod year 100) 0)) true
    (not (= (mod year 400) 0)) false
    :else true))

; '_______'
