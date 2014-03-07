(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if
      (== (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   (divides? 15 n) "gotcha!"
   :else ""))

(defn teen? [age]
  (if (< age 20)
    (if (>= age 13) true false)
    false))

(defn not-teen? [age]
  (if (teen? age) false true))

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
