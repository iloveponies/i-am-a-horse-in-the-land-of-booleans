(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
   (= x false) false
   (= x nil) false
   :else true
   ))

(defn abs [x]
  (cond
   (< x 0) (* -1 x)
   :else x
   ))

(defn divides? [divisor n]
  (cond
   (== (mod n divisor) 0) true
   :else false
   ))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""
   ))

(defn teen? [age] (<= 13 age 19))

(defn not-teen? [age]
  (cond
   (not (teen? age)) true
   :else false
   ))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true
   )
  )

(defn leap-year? [year]
  (cond
   (or
    (and (divides? 4 year) (not (divides? 100 year)))
    (and (divides? 4 year) (divides? 400 year))
   ) true
   :else false
   ))

; '_______'
