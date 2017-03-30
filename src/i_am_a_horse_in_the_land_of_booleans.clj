(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
    false
    (if (= x false)
      false
      true)))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  ":(")

(defn fizzbuzz [n]
  ":(")

(defn teen? [age]
  (if (< age 13)
    false
    (if (> age 19)
      false
      true)))


(defn not-teen? [age]
  (if (teen? age)
    false
    true))

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
