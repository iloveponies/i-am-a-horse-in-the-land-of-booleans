(ns i-am-a-horse-in-the-land-of-booleans
(:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (false? x) (nil? x))
    false
    true))

(defn abs [x]
  ":(")

(defn divides? [divisor n]
  ":(")

(defn fizzbuzz [n]
  ":(")

(defn teen? [age]
  (if (<= 13 age 19)
    true
    false))

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
