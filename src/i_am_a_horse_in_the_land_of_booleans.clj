(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

;;; everything but nil and false are true!
;;; == should be used to compare numbers, it does not look at number types i.e (== 4 4.0) => true

(defn boolean
  [x]
  (if (or (= x nil) (= x false))
    false
    true))

(defn abs
  [x]
  (if (> x 0)
    x
    (- x)))

(defn divides?
  [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""))

(defn teen?
  [age]
  (if (<= 13 age 19)
    true
    false))

(defn not-teen?
  [age]
  ( not (teen? age)))

(defn generic-doublificate
  [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (vector? x) (list? x)) (* (count x) 2)
    :else true))

(defn leap-year?
  [year]
  (if (or
       (and (divides? 4 year) (not (divides? 100 year)))
       (divides? 400 year))
    true
    false))
