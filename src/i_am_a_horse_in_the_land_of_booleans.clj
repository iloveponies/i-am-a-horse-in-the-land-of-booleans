(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (* x -1) x)
  )

(defn divides? [divisor n]
  (if (mod divisor n) true false))

(defn fizzbuzz [n]
  (cond
   (== (mod n 15) 0) "gotcha!"
   (== (mod n 5) 0) "buzz"
   (== (mod n 3) 0) "fizz"
   :else "")
  )

(defn teen? [age]
  (if (<= 13 age 19) true false)
  )

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  (cond
   (number? x) (* x x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true)
  )

(defn leap-year? [year]
  ":(")

; '_______'
