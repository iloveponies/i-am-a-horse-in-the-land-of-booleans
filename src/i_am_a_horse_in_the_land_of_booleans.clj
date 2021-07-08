(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (neg? x)
    (- x)
    x))

(defn divides? [divisor n]
  (if (zero? (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (zero? (mod n 15)) "gotcha!"
    (zero? (mod n 5))  "buzz"
    (zero? (mod n 3))  "fizz"
    :else ""))

(defn teen? [age]
  (cond
    (<= age 12) false
    (>= age 20) false
    :else true))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty?  x) nil
    (or (vector? x) (list? x)) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (cond
   (zero? (mod year 100)) (zero? (mod year 400))
   (zero? (mod year 4)) true
   :else false))

; '_______'
