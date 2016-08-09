(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (false? x) (nil? x))
    false
    true))

(defn abs [x]
  (if (neg? x)
    (- x)
    x))

(defn divides? [divisor n]
  (if (zero? divisor)
    false
    (if (zero? (mod n divisor))
      true
      false)))

(defn fizzbuzz [n]
  (cond
    (zero? (mod n 15)) "gotcha!"
    (zero? (mod n 3)) "fizz"
    (zero? (mod n 5)) "buzz"
    :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
