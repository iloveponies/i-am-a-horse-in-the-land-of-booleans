(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if ( > x 0) x (- x)))

(defn divides? [divisor n]
   (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
     (divides? 15 n) "gotcha!"
     (divides? 5 n) "buzz"
     (divides? 3 n) "fizz"
     :else ""
     ))

(defn teen? [age]
   (and (<= age 19) (>= age 13)))

(defn not-teen? [age]
   (not (teen? age)))

(defn doubleNumber [x]
  (* 2 x))



(defn generic-doublificate [x]
  (cond
   (number? x)  (doubleNumber x)
   (empty? x) nil
   (or (list? x) (vector? x)) (doubleNumber (count x))
   :else  true
   ))

(defn leap-year? [year]
  (cond
   (divides? 400 year) true
   (and (divides? 4 year) (not (divides? 100 year))) true
   :else false
   ))

; '_______'
