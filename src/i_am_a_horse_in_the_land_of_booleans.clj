(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (neg? x) (* x -1) x))

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
  (if (< age 13) true (if (> age 19) true false)))

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
