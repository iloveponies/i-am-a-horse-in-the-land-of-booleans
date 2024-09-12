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
  (if (== (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond (divides? 15 n) "gotcha!"
        (divides? 5 n) "buzz"
        (divides? 3 n) "fizz"
        :else
        ""))

(defn teen? [age]
  (if (and (<= age 19) (>= age 13))
    true
    false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
        (number? x) (* x 2)
        (empty? x) nil
        (or (vector? x) (list? x)) (* (count x) 2)
        :else
        true))

(defn leap-year? [year]
  (if (divides? 4 year)
    (cond (divides? 400 year) true
          (divides? 100 year) false
          :else
          true
    )
    false))

; '_______'
