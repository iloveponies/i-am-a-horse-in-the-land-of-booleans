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
  (= 0 (mod n divisor)))


(defn fizzbuzz [n]
  (cond
   (zero? (mod n 15)) "gotcha!"
   (zero? (mod n 3)) "fizz"
   (zero? (mod n 5)) "buzz"
   :else ""))

(defn teen? [age]
  (if (<= 13 age 19)
    true
    false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (or
   (divides? 400 year)
   (and
    (divides? 4 year)
    (not (divides? 100 year)))))

