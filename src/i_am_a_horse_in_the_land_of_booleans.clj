(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= false x) (= nil x))
    false
    true))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
   (if (= 0 (mod n divisor))
     true
     false))

(defn fizzbuzz [n]
  (cond
   (= 0 (mod n 15)) "gotcha!"
   (= 0 (mod n 3)) "fizz"
   (= 0 (mod n 5)) "buzz"
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
   (and (coll? x) (empty? x)) nil
   (or (list? x) (vector? x)) (* (count x) 2)
   :else true))

(defn leap-year? [year]
  (cond
   (not= 0 (mod year 4)) false
   (not= 0 (mod year 100)) true
   (= 0 (mod year 400)) true
   :else false))

; '_______'
