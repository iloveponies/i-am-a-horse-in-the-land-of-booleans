(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [n x]
  (if (== (mod x n) 0) true false))

(defn fizzbuzz [n]
  (cond
   (== (mod n 15) 0) "gotcha!"
   (== (mod n 3) 0) "fizz"
   (== (mod n 5) 0) "buzz"
   :else ""))

(defn teen? [age]
  (if (< 12 age 20) true false))

(defn not-teen? [x]
  (not (teen? x)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (or (list? x) (vector? x)) (* (count x) 2)
   :else true))

(defn leap-year? [y]
  (if (== (mod y 100) 0)
    (if (== (mod y 400) 0) true false)
    (if (== (mod y 4) 0) true false)))

; '_______'
