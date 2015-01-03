(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= nil x) (= false x))
    false
    true))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
 (cond 
   (and (divides? 3 n) (divides? 5 n)) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn teen? [age]
 (if (and (> age 12) (< age 20))
   true
   false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))

(defn leap-year? [year]
 (cond
   (and (divides? 4 year) (divides? 400 year)) true
   (and (divides? 4 year) (divides? 100 year)) false
   (divides? 4 year) true
   :else false))

; '_______'
