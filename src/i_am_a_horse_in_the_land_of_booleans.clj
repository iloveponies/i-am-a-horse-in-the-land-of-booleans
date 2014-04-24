(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x false) false
    (if (= x nil) false true)
))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n)  "gotcha!"
    (divides? 3 n)   "fizz"
    (divides? 5 n)   "buzz"
    :else            ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (list? x) (* (count x) 2)
   (vector? x) (* (count x) 2)
   :else true))


(defn leap-year? [year]
  (cond
   (> (mod year 4) 0) false
   (> (mod year 100) 0) true
   (= (mod year 400) 0) true
   :else false))


; '_______'
