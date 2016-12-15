(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if (= x false) false (if (= x nil) false true)))

(defn abs [x]
  (if (< x 0) (- 0 x) x))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor)) true false))

(defn fizzbuzz [n]
  (cond
   (== 0 (mod n 15)) "gotcha!"
   (== 0 (mod n 5)) "buzz"
   (== 0 (mod n 3)) "fizz"
   :else ""))

(defn teen? [age]
  (if (>= age 13) (if (<= age 19) true false) false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (or (list? x) (vector? x)) (* (count x) 2)
   :else true))

(defn leap-year? [year]
  (cond
   (== 0 (mod year 400)) true
   (== 0 (mod year 100)) false
   (== 0 (mod year 4)) true
   :else false))

(generic-doublificate "")
; '_______'
