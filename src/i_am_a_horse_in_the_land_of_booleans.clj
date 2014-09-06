(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor)) true false))

(defn fizzbuzz [n]
  (if (divides? 15 n) "gotcha!"
    (if (divides? 5 n) "buzz"
      (if (divides? 3 n) "fizz" ""))))

(defn teen? [age]
  (if (<= 13 age 19) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (if (number? x) (* x 2)
    (if (empty? x) nil
      (if (or (list? x) (vector? x)) (* 2 (count x)) true))))

(defn leap-year? [year]
  (if (divides? 4 year)
    (if (divides? 100 year)
      (if (divides? 400 year) true false) true) false))
