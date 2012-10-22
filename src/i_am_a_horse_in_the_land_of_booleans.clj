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
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   (divides? 15 n) "gotcha!"
   :else ""))

(defn teen? [age]
 (> 13 age 19))

(defn not-teen? [age]
  (cond
   (< age 13)
   (> age 19))
   :else false)

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
