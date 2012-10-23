(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (* x -1) x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond 
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""))

(defn teen? [age]
  (if (and (< age 20) (> age 12)) true false)) 

(defn not-teen? [age]
  (cond
   (teen? age) false
   :else true))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   :else true
   )
  )

(defn leap-year? [year]
  (cond
   (== (mod year 400) 0) true
   (== (mod year 100) 0) false
   (== (mod year 4) 0) true
   :else false))