(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
   (and (divides? 3 n) (not (divides? 5 n)) (not (divides? 15 n))) "fizz"
   (and (divides? 5 n) (not (divides? 15 n))) "buzz"
   (divides? 15 n) "gotcha!"
   :else ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn dbl [x] (* 2 x))

(defn generic-doublificate [x]
  (cond
   (number? x) (dbl x)
   (empty? x) nil
   (or (list? x) (vector? x)) (dbl (count x))
   :else true))


(defn leap-year? [year]
  (and (divides? 4 year) (or (not (divides? 100 year)) (divides? 400 year))))

; '_______'





