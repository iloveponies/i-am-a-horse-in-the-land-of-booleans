(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (and (not= x nil) (not= x false)))

(defn abs [x]
  (if (< x 0) (* -1 x) x))

(defn divides? [divisor n]
  ":(")

(defn fizzbuzz [n]
  ":(")

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
