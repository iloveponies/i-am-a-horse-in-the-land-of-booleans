(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (and (not= x nil)
       (not= x false)))

(defn abs [x]
  (if (neg? x) (- x) x))

(defn divides? [divisor n]
  (zero? (mod n divisor)))

(defn fizzbuzz [n]
  (cond (divides? 15 n) "gotcha!"
        (divides? 3 n) "fizz"
        (divides? 5 n) "buzz"
        :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond (number? x) (* 2 x)
        (empty? x) nil
        (or (list? x) (vector? x)) (* 2 (count x))
        :else true))

(defn leap-year? [year]
  (cond (divides? 400 year) true
        (divides? 100 year) false
        :else (divides? 4 year)))

; '_______'
