(ns i-am-a-horse-in-the-land-of-booleans
  (:use clojure.repl)
  (:refer-clojure :exclude [boolean]))

(doc map)

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (== 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
   (= n "") ""
   (== 0 (mod n 15)) "gotcha!"
   (== 0 (mod n 3)) "fizz"
   (== 0 (mod n 5)) "buzz"
   :else ""))

(defn teen? [age]
  (if (< 12 age 20)
    true
    false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* (count x) 2)
   (vector? x) (* (count x) 2)
   :else true))

(defn leap-year? [year]
  (if (or
       (and (== 0 (mod year 4)) (not (== 0 (mod year 100))))
       (== 0 (mod year 400)))
    true
    false))

; '_______'
