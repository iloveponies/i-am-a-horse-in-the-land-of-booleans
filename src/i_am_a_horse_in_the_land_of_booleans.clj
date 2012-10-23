(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x] (boolean x))

(defn abs [x] (if(>= x 0) x (- x)))

(defn divides? [divisor n] (if (== (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else          ""))

(defn teen? [age] (if (<= 13 age 19) true false))

(defn not-teen? [age]
  (if (not (teen? age)) true false))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* (count x) 2)
   (vector? x) (* (count x) 2)
   :else true))

(defn leap-year? [year]
  (or (and (divides? 4 year) (not (divides? 100 year)))
      (and (divides? 100 year) (divides? 400 year))))