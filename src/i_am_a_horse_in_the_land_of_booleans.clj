(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if (or (= x nil)(= x false)) false true))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor)) true false))

(defn fizzbuzz [n]
  (cond
   (== 0 (mod n 15)) "gotcha!"
   (== 0 (mod n 5)) "buzz"
   (== 0 (mod n 3)) "fizz"
   :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (cond
   (and (teen? age)) false
   :else true))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   :else true))


(defn leap-year? [year]
  (cond
   (not (== 0 (mod year 4))) false
   (not (== 0 (mod year 100))) true
   (not (== 0 (mod year 400))) false
   :else true))

; '_______'
