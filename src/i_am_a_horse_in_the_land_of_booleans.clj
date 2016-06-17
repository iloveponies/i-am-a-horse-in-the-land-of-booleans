(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x true) true (if (= x nil) false (if (= x false) false true))))

(defn abs [x]
  ":(")

(defn divides? [divisor n]
  ":(")

(defn fizzbuzz [n]
  ":(")

(defn teen? [age]
  ":(")

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
