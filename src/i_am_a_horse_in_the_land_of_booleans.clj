(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false))
    false
    true))

(defn abs [x]
 (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""
   ))

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
  (or (vector? x) (list? x)) (* 2 (count x))
  :else true
  ))

(defn leap-year? [year]
 (if (divides? 4 year)
   (cond
    (and (divides? 100 year) (not (divides? 400 year))) false
    :else true)
    false))

; '_______'
