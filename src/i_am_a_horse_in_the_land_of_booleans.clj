(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (>= x 0)
    x
    (* -1 x)))

(defn divides? [divisor n]
  (== (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (vector? x) (list? x)) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (cond
   (and (divides? 100 year) (divides? 400 year)) true
   (and (divides? 4 year) (not (divides? 100 year))) true
   :else false))

; '_______'
