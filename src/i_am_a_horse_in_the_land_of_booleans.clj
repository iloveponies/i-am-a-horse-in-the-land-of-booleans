(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if ( or (= x false) (= x nil))
    false
    true))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (== 0 (mod n 15))  "gotcha!"
    (== 0 (mod n 3))   "fizz"
    (== 0 (mod n 5))   "buzz"
    :else               ""))

(defn teen? [age]
    (if (<= 13 age 19) true false))

(defn not-teen? [age]
  (if (not (teen? age)) true false))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (if (and (== 0 (mod year 4)) (or (not (== 0 (mod year 100))) (== 0 (mod year 400))))
    true
    false))
; '_______'
