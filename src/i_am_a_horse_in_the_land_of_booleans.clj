(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

; (boolean false)

(defn abs [x]
  (if (> 0 x) (* -1 x) x))

; (abs -2.1)

(defn divides? [divisor n]
  (if (= 0 (mod n divisor)) true false))

; (divides? 5 10)

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

; (fizzbuzz 5)

(defn teen? [age]
  (<= 13 age 19))

; (teen? 18.2)

(defn not-teen? [age]
  (not (teen? age)))

; (not-teen? 11)

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (cond
    (not (divides? 4 year)) false
    (not (divides? 100 year)) true
    (divides? 400 year) true
    :else false))

; (leap-year? 1605)

; '_______'
