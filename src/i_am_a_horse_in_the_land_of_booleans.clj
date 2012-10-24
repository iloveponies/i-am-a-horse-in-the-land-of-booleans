(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x] (if x true false ))

(defn abs [x] (if (< x 0) (- x) x ))

(defn divides? [divisor n] (== 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond 
    (divides? 15 n) "gotcha!"
    (divides? 5 n)  "buzz"
    (divides? 3 n)  "fizz"
    :else 			""))

(defn teen? [age] (if (< 12 age 20) true false))

(defn not-teen? [age] (if (not teen? age)))

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