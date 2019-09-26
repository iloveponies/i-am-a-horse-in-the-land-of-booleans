(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
   (= x false) false
   (= x nil) false
   :else true))

(defn abs [x]
  (if (> x 0)
    x
    (- x)))


(defn divides? [divisor n]
  (zero? (mod n divisor)))


(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""))


(defn teen? [age]
  (< 12 age 20))


(defn not-teen? [age]
  (not (teen? age)))


(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))


(defn leap-year? [year]
  (cond
   (divides? 400 year) true
   (divides? 100 year) false
   (divides? 4 year) true
   :else false))
