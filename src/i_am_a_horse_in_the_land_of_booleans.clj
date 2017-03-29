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
  (if (== 0 (mod n divisor))
  true
  false))

(defn fizzbuzz [n]
  (cond
    (== 0 (mod n 15)) "gotcha!"
    (== 0 (mod n 5)) "buzz"
    (== 0 (mod n 3)) "fizz"
  :else ""))

(defn teen? [age]
  (if (>= 19 age 13)
         true
         false))

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true
    ))

(defn leap-year? [year]
  ":(")

; '_______'
