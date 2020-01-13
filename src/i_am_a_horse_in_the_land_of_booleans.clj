(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (>= x 0) x (- x)))

(defn divides? [divisor n]
  (= 0 (mod n divisor)))


(defn fizzbuzz [n]
  (cond
    (= 0 (mod n 15))  "gotcha!"
    (= 0 (mod n 3))   "fizz"
    (= 0 (mod n 5))   "buzz"
    :else             ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x)   nil
    (or (list? x) (vector? x))
      (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (cond
    (= 0 (mod year 400)) true
    (= 0 (mod year 100)) false
    (= 0 (mod year 4)) true
    :else false))

; '_______'
