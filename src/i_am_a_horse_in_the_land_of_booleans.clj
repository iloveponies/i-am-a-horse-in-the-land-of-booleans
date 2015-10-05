(ns i-am-a-horse-in-the-land-of-booleans)
  (:refer-clojure :exclude [boolean])

(defn boolean [x]
  (if (or (= x false) (= x nil))
  false
  true))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn teen? [age]
  (if (<= 13 age 19)
  true
  false))

(defn not-teen? [age]
  (if (= (teen? age) false)
    true
    false))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (cond
   (and (= (mod year 100) 0) (== (mod year 400) 0)) true
   (== (mod year 100) 0) false
   (== (mod year 4) 0) true
   :else false))
; ; '_______'
