(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (> x 0)
    x
    (- x)))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""
    ))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true
  ))

(defn leap-year? [year]
  (let [by4 (divides? 4 year)
        by100 (divides? 100 year)
        by400 (divides? 400 year)]
  (and by4 (or (and by100 by400) (not by100)) true
)))

; '_______'
