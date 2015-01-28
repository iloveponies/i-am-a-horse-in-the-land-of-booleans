(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true
    false))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
   (zero? (mod n 15)) "gotcha!"
   (zero? (mod n 5)) "buzz"
   (zero? (mod n 3)) "fizz"
   :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2(count x))
  :else true))

(defn leap-year? [year]
  (cond
   (zero? (mod year 400)) true
   (zero? (mod year 100)) false
   (zero? (mod year 4)) true
   :else false))
