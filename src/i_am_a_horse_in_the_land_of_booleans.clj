(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x false) (= x nil)) false true))

(defn abs [x]
  (if (< x 0) (* -1 x) x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
     (and (divides? 3 n) (divides? 5 n)) "gotcha!"
     (divides? 3 n) "fizz"
     (divides? 5 n) "buzz"
     :else ""))

(defn teen? [age]
  (if (and (>= age 13) (<= age 19)) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
     (number? x) (* x 2)
     (empty? x)  nil
     (or (list? x) (vector? x)) (* (count x) 2)
     :else true))

(defn leap-year? [year]
  (cond
     (divides? 100 year) (divides? 400 year)
     (divides? 4 year) true
     :else false))

; '_______'
