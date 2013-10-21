(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (* x -1) x))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
     (divides? 15 n) "gotcha!"
     (divides? 3 n)  "fizz"
     (divides? 5 n)  "buzz"
     :else           ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
     (number? x)                (* 2 x)
     (empty? x)                 nil
     (or (list? x) (vector? x)) (generic-doublificate (count x))
     :else                      true))

(defn leap-year? [year]
  (cond
     (= (mod year 400) 0) true
     (= (mod year 100) 0) false
     (= (mod year 4) 0)   true
     :else                false))

; '_______'
