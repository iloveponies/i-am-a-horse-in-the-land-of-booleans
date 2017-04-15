(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean
  [x]
  (if x true false))

(defn abs
  [x]
  (Math/abs x))

(defn divides?
  [divisor n]
  (zero? (mod n divisor)))

(defn fizzbuzz
  [n]
  (cond (and (divides? 3 n) (divides? 5 n)) "gotcha!"
        (divides? 3 n) "fizz"
        (divides? 5 n) "buzz"
        :else ""))

(defn teen?
  [age]
  (<= 13 age 19))

(defn not-teen?
  [age]
  (not (teen? age)))

(defn generic-doublificate
  [x]
  (cond (number? x) (* x 2)
        (sequential? x) (when-not (empty? x)
                          (* 2 (count x)))
        (and (map? x) (empty? x)) nil
        :else true))

(defn leap-year?
  [year]
  (cond (divides? 400 year) true
        (and (divides? 4 year) (not (divides? 100 year))) true 
        :else false))

; '_______'
