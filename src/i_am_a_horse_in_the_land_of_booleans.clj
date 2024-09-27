(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (if (zero? (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (zero? (mod n 15)) "gotcha!"
    (zero? (mod n 3)) "fizz"
    (zero? (mod n 5)) "buzz"
    :else ""))

(defn teen? [age]
  (if (<= 13 age 19)
    true
    false))


(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (list? x) (vector? x)) (* (count x) 2)
    :else true))

(defn leap-year? [year]
  (cond
    (not (zero? (mod year 4))) false
    (not (zero? (mod year 100))) true
    (not (zero? (mod year 400))) false
    :else true))
; '_______'
