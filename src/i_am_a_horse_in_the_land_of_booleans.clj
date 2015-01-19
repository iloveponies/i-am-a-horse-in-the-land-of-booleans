(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or x nil x false)
  true
    false))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (if (=(mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
 (cond
  (and (divides? 3 n) (not (divides? 15 n))) "fizz"
  (and (divides? 5 n) (not (divides? 15 n))) "buzz"
  (divides? 15 n) "gotcha!"
  :else ""))

(defn teen? [age]
  (if (and (<= age 19) (>= age 13))
           true
           false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* (count x) 2)
   :else true))

(defn leap-year? [year]
  ":(")

; '_______'
