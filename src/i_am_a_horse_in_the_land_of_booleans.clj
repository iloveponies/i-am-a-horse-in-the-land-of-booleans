(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
 (if x
 true
 false))


(defn abs [x]
    (if (<= x 0)
    (* x -1)
    x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
   true
   false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""))

(defn teen? [age]
 (<= 13 age 19))

(defn not-teen? [age]
  (or (< age 13) (> age 19)))

(defn generic-doublificate [x]
 (cond 
   (number? x) (+ x x)
   (empty? x) nil
   (list? x) (+ (count x) (count x))
   (vector? x) (+ (count x) (count x))
    :else true))

(defn leap-year? [year]
 (cond
 (divides? 400 year) true
 (divides? 100 year) false
  (divides? 4 year) true
  :else false))

; '_______'
