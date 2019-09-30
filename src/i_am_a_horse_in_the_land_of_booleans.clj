(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (* x -1) x))

(defn divides? [divisor n]
  (== (mod n divisor) 0 ))

(defn fizzbuzz [n]
  (if (divides? 3 n)
    (if (divides? 5 n) "gotcha!" "fizz")
    (if (divides? 5 n) "buzz" "")))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond 
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (if (divides? 4 year) 
    (if (divides? 100 year)
      (if (divides? 400 year)
        true
        false)
      true)
    false))

; '_______'
