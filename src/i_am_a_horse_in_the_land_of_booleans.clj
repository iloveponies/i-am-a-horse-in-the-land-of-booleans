(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (nil? x) (false? x)) false true ))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (= 0 (rem n divisor)))

(defn fizzbuzz [n]
  (cond (zero? (mod n 15)) "gotcha!"
         (zero? (mod n 5)) "buzz"
         (zero? (mod n 3)) "fizz"
               :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond (number? x) (* 2 x)
        (empty? x) nil
        (list? x) (* 2 (count x))
        (vector? x) (* 2 (count x))
               :else true))

(defn leap-year? [year]
  (if (and (divides? 100 year) (divides? 400 year)) true
      (if (and (divides? 4 year) (not (divides? 100 year))) true false)))

; '_______'
