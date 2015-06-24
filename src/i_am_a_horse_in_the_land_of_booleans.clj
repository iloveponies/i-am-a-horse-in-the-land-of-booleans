(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (* x -1) x))

(defn divides? [divisor n]
  (== 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn teen? [age]
   (if (< 12 age 20) true false))

(defn not-teen? [age]
  (if (not (teen? age)) true false))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (and (coll? x) (empty? x)) nil
   (vector? x) (* (count x) 2)
   (list? x) (* (count x) 2)
   (map? x) true
   :else true
  ))

(defn leap-year? [year]
  (cond
   (divides? 400 year) true
   (divides? 100 year) false
   (divides? 4 year) true
   :else false
   ))

; '_______'
