(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (neg? x) (* x -1) x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"

    :else ""))

(defn teen? [age]
  (if (or (< age 13)
          (> age 19)) false true))

(defn not-teen? [age]
  (false? (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (list? x)
        (vector? x)) (* (count x) 2)
    :else true))

(defn leap-year? [year]
  (cond
    (and
     (or
      (divides? 400 year)
      (false? (divides? 100 year)))
     (divides? 4 year)) true
    :else false))

; '_______'
