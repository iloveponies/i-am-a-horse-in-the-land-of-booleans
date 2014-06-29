(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (not (or (false? x) (nil? x))))

(defn abs [x]
  (if (>= x 0) x (- x)))

(defn divides? [divisor n]
  (== (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
   (zero? (mod n 15)) "gotcha!"
   (zero? (mod n 3))  "fizz"
   (zero? (mod n 5))  "buzz"
   :elze ""))

(defn teen? [age]
  (and (> age 12) (< age 20)))

(defn not-teen? [age]
  (not (teen? age)))


(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty?  x) nil
   (or (list?   x) (vector? x)) (if (empty? x) nil (* 2 (count x)))
   :else true))

(defn div-by-x [n x] (zero? (mod n x)))

(defn leap-year? [year]
  (cond
   (not (div-by-x year 4)) false
   (not (div-by-x year 100)) true
   (not (div-by-x year 400)) false
   :else true))

; '_______'
