(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (> x 0) x (- x)))

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [x]
  (cond
   (divides? 15 x) "gotcha!"
   (divides? 3 x) "fizz"
   (divides? 5 x) "buzz"
   :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (or (< age 13) (> age 19)))

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

; '_______'
