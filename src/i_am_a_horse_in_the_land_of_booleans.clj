(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x false)
    false
    (if (= x nil)
      false
      true)))

(defn abs [x]
  "Returns the absolute value of x"
  (if (< x 0) (* -1 x) x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3  n) "fizz"
    (divides? 5  n) "buzz"
    :else           ""))

(defn teen? [age]
  "Returns true if age is at least 13 and at most 19."
  (if (< age 13)
    false
    (if (> age 19)
      false
      true)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty?  x) nil
    (list?   x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else       true))

(defn leap-year? [year]
  (cond
    (divides? 400 year) true
    (divides? 100 year) false
    (divides? 4   year) true
    :else               false))

; '_______'
