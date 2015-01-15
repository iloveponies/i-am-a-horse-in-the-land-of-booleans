(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean])
  )

(defn boolean [x]
  (if (or false nil x) true false))

(defn abs [x]
  (if (< 0 x) (* x 1) (* x -1)))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn teen? [age]
  (if(or (> 13 age) (< 19 age)) false true))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* (count x) 2)
   (vector? x) (* (count x) 2)
   :else true))

(defn leap-year? [year]
  (cond
   (and (divides? 4 year) (not(divides? 100 year))) true
   (and (divides? 400 year) (divides? 100 year)) true
   :else false))

; '_______'
