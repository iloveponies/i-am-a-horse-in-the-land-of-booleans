(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (not (contains? #{false nil} x)))

(defn abs [y] (if (< y 0)
                (- y)
                y))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  ":(")

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  ";<")

 (defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'












