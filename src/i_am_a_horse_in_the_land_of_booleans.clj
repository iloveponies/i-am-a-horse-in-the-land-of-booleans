(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x] (boolean x))

(defn abs [x] (if (< x 0) (- x) x ))

(defn divides? [divisor n] (if (== 0 (mod n divisor)) true false))

(defn fizzbuzz [n]
  (cond 
   (== 0 (mod n 3))	 "fizz"
   (== 0 (mod n 5))	 "buzz"
   (== 0 (mod n 15)) "gotcha!"
   :else		     ""))	

(defn teen? [age] (if (< 12 age 20) true false))

(defn not-teen? [age] (if (and (teen? age) true )false true))

(defn generic-doublificate [n]
  (cond
   (number? n)	(* n 2)
   (empty? n)	nil
   (list? n)	(* 2 (count n))
   (vector? n)	(* 2 (count n))
   :else		true))

(defn leap-year? [year]
  (cond
   (== 0 (mod year 400))	true
   (== 0 (mod year 100))	false
   (== 0 (mod year 4))		true
   :else					false))