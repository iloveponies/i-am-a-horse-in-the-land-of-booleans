(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (> x 0)
    x
    (- x)))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
   (== 0 (mod n 15)) "gotcha!"
   (== 0 (mod n 5)) "buzz"
   (== 0 (mod n 3)) "fizz"
   :else ""))


(defn teen? [age]
  (if (and (<= 13 age) (>= 19 age))
    true
    false))

(defn not-teen? [age]
  (if (not (teen? age))
    true
    false))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (vector? x) (list? x)) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (cond
   (not (== 0 (mod year 4))) false
   (not (== 0 (mod year 100))) true
   (not (== 0 (mod year 400))) false
   :else true))

; '_______'
