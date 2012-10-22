(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
   (boolean x)
  )

(defn abs [x]
 (if (> 0 x)
  (- x)
   x
   )
  )

(defn divides? [divisor n]
  (
   if(= (mod n divisor) 0)
   true
   false
   ))

(defn fizzbuzz [n]
  (
  cond
   (= (mod n 15) 0) "gotcha!"
   (= (mod n 3) 0) "fizz"
   (= (mod n 5) 0) "buzz"
   :else ""
   ))

(defn teen? [age]
  (if (and (<= 13 age) (>= 19 age))
   true
   false
    ))

(defn not-teen? [age]
   (if (or (> 13 age) (< 19 age))
   true
   false
    ))

(defn generic-doublificate [x]
  (
 cond 
   (number? x) (* x 2)
   (empty? x) nil
   (or (vector? x) (list? x)) (* (count x) 2)
   :else true
   ))

(defn leap-year? [year]
 ( cond
  (= (mod year 400) 0) true
   (and (= (mod year 4) 0) (> (mod year 100) 0)) true
  :else false
   )
  )