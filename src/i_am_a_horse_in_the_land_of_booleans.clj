(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean "Acts like the built-in boolean func" [x]
  (if x true false))

(defn abs "Returns the absolute value" [x]
  (if (< x 0) (* x -1) x))

(defn divides? [divisor n] "returns true if divisible and false otherwise"
  (if (== (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond  
    (divides? 15 n) "gotcha!" 
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? "Reality check" [age]
  (<= 13 age 19))

(defn not-teen? [age] "Unreality check"
  (not (teen? age)))

(defn generic-doublificate [x] "Bizarre behaviour"
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (cond 
        (list? x) true
        (vector? x) true
        :else false) (* (count x) 2)
    :else true))

(defn leap-year? [year] "Dummy leap year check"
  (cond
    (divides? 400 year) true
    (divides? 100 year) false
    (divides? 4 year) true
    :else false))

; '_______'
