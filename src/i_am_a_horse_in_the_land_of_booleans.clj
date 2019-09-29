(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (pos? x) x (* -1 x)))

(defn divides? [divisor n]
  (zero? (mod n divisor)))

(defn fizzbuzz [n]
  (if (divides? 15 n) "gotcha!"
    (if (divides? 5 n) "buzz" 
      (if (divides? 3 n) "fizz" ""))))

(defn teen? [age] (> 20 age 12))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (if (number? x) (* 2 x)
    (if (empty? x) nil
      (if (or (list? x) (vector? x))
        (* 2 (count x)) true))))

(defn leap-year? [year]
  (if (divides? 4 year) 
    (if (divides? 100 year) 
      (divides? 400 year) true) false))
