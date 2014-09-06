(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil) false
    (if (= x false) false true)))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
   (== (mod n 3) (mod n 5) 0) "gotcha!"
   (== (mod n 3) 0) "fizz"
   (== (mod n 5) 0) "buzz"
   :else ""))

(defn teen? [age]
  (if (<= 13 age 19) true false))

(defn not-teen? [age]
  ":(")

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
  ":(")

; '_______'
