(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (* x -1) x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
   (= (divides? 15 n) true)  "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn teen? [age]
  (if (<= 13 age 19) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (= (number? x) true) (* x 2)
   (= (empty? x) true) nil
   (= (or (list? x) (vector? x)) true) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (cond
   (== (+ (mod year 4) (mod year 400) (mod year 100)) 0) true
   (== (+ (mod year 4) (mod year 100)) 0) false
   (== (mod year 4) 0) true
   :else false))

; '_______' jee
