(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (= (mod n 15) 0) (str "gotha!")
    (= (mod n 3) 0) (str "fizz")
    (= (mod n 5) 0) (str "buzz")
    :else (str "")))

(defn teen? [age]
  (if (<= age 12)
    false
    (if (>= age 20)
      false
      true)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
