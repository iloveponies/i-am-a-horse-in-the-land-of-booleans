(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  "Return whether [x] is true or false"
  (if x true false))

(defn abs [x]
  (if (< x 0)
    (* x -1)
    x))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? [age]
  (if (<= 13 age 19)
    true
    false))

(defn not-teen? [age]
  (cond
    (not (teen? age)) true
    :else false))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (list? x) (* (count x) 2)
    (vector? x) (* (count x) 2)
    :else true))

;; if (year is not divisible by 4) then (it is a common year)
;; else
;; if (year is not divisible by 100) then (it is a leap year)
;; else
;; if (year is not divisible by 400) then (it is a common year)
;; else (it is a leap year)

(defn leap-year? [year]
  (cond
    (not (== 0 (mod year 4))) false
    (not (== 0 (mod year 100))) true
    (not (== 0 (mod year 400))) false
    :else true))




; '_______'
