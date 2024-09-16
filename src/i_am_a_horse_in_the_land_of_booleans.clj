(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

;; exercise 1.
;; Implementing a boolean function
(defn boolean [x]
  (if x true false))

;; exercise 3.
;; absolute value
(defn abs [x]
  (if (< x 0)
    (- x)
    x))

;; exercise 4
(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
  true
  false))

;; exercise 5
(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""))

;; exercise 2.
;; Are they a teenager?
(defn teen? [age]
  (<= 13 age 19))

;; exercise 7
(defn not-teen? [age]
  (not (teen? age)))

;; exercise 6
(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))

;; exercise 8
(defn leap-year? [year]
  (cond
    (divides? 400 year) true
    (divides? 100 year) false
    (divides? 4 year) true
    :else false))

                                        ; '_______'
