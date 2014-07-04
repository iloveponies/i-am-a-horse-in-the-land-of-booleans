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


;; returns truthy if age is at least 13 and at most 19.
;; Use only one comparison operator and give it three arguments.

(defn teen? [age]
  (<= 13 age 19))


(defn not-teen? [age]
  ":(")


(defn generic-doublificate [x]
  ":(")


(defn leap-year? [year]
  ":(")


; '_______'
