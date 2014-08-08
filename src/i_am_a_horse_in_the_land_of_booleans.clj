(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
        (if (or (= x nil) (= x false)) false true))

(defn teen? [age]
  (if (<= 13 age 19) true false))

(defn abs [n]
  (if (< n 0) (- n) n))

(defn divides? [divisor n] (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
   (= (mod n 15) 0) "gotcha!"
   (= (mod n 5) 0) "buzz"
   (= (mod n 3) 0) "fizz"
   :else ""))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* (count x) 2)
   (vector? x) (* (count x) 2)
   :else true))

(defn not-teen? [age]
  (not (teen? age)))

(defn leap-year? [year]
  (cond
   (and (= (mod year 100) 0) (= (mod year 400) 0)) true
   (and (< year 100) (= (mod year 4) 0)) true
   :else false))

; '_______'
