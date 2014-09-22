(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond 
   (= (mod n 15) 0) "gotcha!" 
   (= (mod n 5) 0) "buzz"
   (= (mod n 3) 0) "fizz"
   :else ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn handle-coll [coll]
  (cond 
   (empty? coll) nil
   (list? coll) (* (count coll) 2)
   (vector? coll) (* (count coll) 2)
   :else true))

(defn generic-doublificate [x]
  (cond 
   (number? x) (* x 2)
   (coll? x ) (handle-coll x)
   :else true))

(defn leap-year? [year]
  (if (not (divides? 4 year)) false 
      (if (not (divides? 100 year)) true 
           (if (not (divides? 400 year)) false true))))

; '_______'
