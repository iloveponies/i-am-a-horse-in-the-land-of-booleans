(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (* -1 x) x))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor)) true false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (cond
   (teen? age) false
   :esle true))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* (count x) 2)
   (vector? x) (* (.length x) 2)
   :esle true))

(defn leap-year? [year]
  (cond
   (== (mod year 400) 0) true
   (== (mod year 100) 0) false
   (== (mod year 4) 0) true
  :else false))

