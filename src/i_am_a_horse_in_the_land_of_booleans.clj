(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))


;;for nil and false, it returns false, and for all other values it returns true

(defn boolean [x]
  (if (or (= x nil) (= x false))
    false true))


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
