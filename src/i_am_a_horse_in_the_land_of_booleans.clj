(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
  (- 0 x)
  x))

(abs -17)

(defn divides? [divisor n]
  (== (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
   (not (teen? age)))

(defn generic-doublificate [x]
  (cond
  (number? x) (* x 2)
  (empty? x) nil
  (list? x) (* (count x) 2)
  (vector? x) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (cond
   (= (mod year 400) 0 ) true
   (= (mod year 100) 0 )false
   (= (mod year 4) 0 )true
   :else false))

; '_______'



(generic-doublificate 1)



