(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
   (= x nil) false
   (= x false) false
   :else true))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn teen? [age]
  (if (< 12 age 20) true false))

(defn not-teen? [age]
  ((complement teen?) age))

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
   (divides? 4 year)   true
   :else               false))

; '_______'
