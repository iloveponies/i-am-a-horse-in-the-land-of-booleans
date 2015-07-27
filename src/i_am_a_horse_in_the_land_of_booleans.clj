(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if false false)
  (if nil false)
  :else true)

(defn abs [x]
  (if (> x 0) x)
  (if (< x 0) (* -1 x))
  :else 0)

(defn divides? [divisor n]
  (if (== (mod n divisor) 0) true)
  :else false)

(defn fizzbuzz [n]
  (cond
  (== (mod n 15) 0) "gotcha!"
  (== (mod n 5) 0) "buzz"
  (== (mod n 3) 0) "fizz"
  :else ""))

(defn teen? [age]
  (if (>= age 13) false)
  :else true)

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 count x)
   :else true))

(defn leap-year? [year]
  (cond
   (== (mod year 400)) true
   (== (mod year 100)) false
   (== (mod year 4))   true
   :else false))

; '_______'
