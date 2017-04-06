(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (> x 0) x (* -1 x)))

(defn divides? [divisor n]
  (zero? (mod n divisor)))

(defn fizzbuzz [n]
  (cond
   (zero? (mod n 15)) "gotcha!"
   (zero? (mod n 3)) "fizz"
   (zero? (mod n 5)) "buzz"
   :else ""))

(defn teen? [age]
  (if (<= 13 age 19) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (if
      (or 
       (zero? (mod year 400)) 
       (and (zero? (mod year 4)) (> (mod year 100) 0)))
    true
    false))


; '_______'
