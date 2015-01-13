(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x false)
    ("false")
    (if (= x nil)
      false
      true)))

(defn abs [x]
  (if (< x 0)
    (* x -1)
    x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)  
    true
    false))

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
