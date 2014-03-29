(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (zero? (rem n divisor)))

(defn fizzbuzz [n]
  (cond
   (zero? (rem n 15)) "gotcha!"
   (zero? (rem n 3))  "fizz"
   (zero? (rem n 5))  "buzz"
   :else ""))

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
  (and (zero? (rem year 4)) (or (not (zero? (rem year 100))) (zero? (rem year 400)))))

; '_______'
