(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
  	(- x)
  	x))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor))
  	true
  	false))

(defn fizzbuzz [x]
 (cond
   (== 0 (mod x 15)) "gotcha!"
   (== 0 (mod x 3)) "fizz"
   (== 0 (mod x 5)) "buzz"
   :else ""))

(defn teen? [age]
  (if (<= 13 age 19)
  	true
  	false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
 (cond
  (number? x) (* x 2)
  (empty? x) nil
  (list? x) (* 2 (count x))
  (vector? x) (* 2 (count x))
  :else true))

(defn leap-year? [year]
  (cond
  	(not (== 0 (mod year 4))) false
  	(not (== 0 (mod year 100))) true
  	(not (== 0 (mod year 400))) false
  	:else true))

; '_______'
