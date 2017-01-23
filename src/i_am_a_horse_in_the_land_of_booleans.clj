(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (> 0 x) (- x) x))

(defn divides? [divisor n]
  (== (mod n divisor) 0))

(defn fizzbuzz [n]
  (if (divides? 15 n) "gotcha!"
  (if (divides? 5 n) "buzz"
  (if (divides? 3 n) "fizz" ""))))

(defn teen? [age]
  (if (< 12 age 20) true false))

(defn not-teen? [age]
  (if (teen? age) false true))

(defn generic-doublificate [x]
  (if (number? x) (* 2 x)
  (if (empty? x) nil
  (if (or (list? x) (vector? x)) (* 2 (count x)) true))))

(defn leap-year? [year]
  (if (divides? 100 year)
    (if (divides? 400 year) true false)
          (divides? 4 year)
  )
)
; '_______'
