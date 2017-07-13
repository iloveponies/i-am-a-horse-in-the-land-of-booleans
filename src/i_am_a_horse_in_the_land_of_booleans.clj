(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= nil x) false (if (= x false) false true)))

(defn abs [x] (if (< x 0) (* x -1) x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
    (= (mod n 15) 0) "gotcha!"
    (= (mod n 3) 0) "fizz"
    (= (mod n 5) 0) "buzz"
    :else ""))



(defn teen? [age]
  (if (and (>= age 13) (<= age 19)) true false))


(defn not-teen? [age] (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (list? x) (vector? x)) (* (count x) 2)
    :else true))

;; A year is a leap year if it is divisible by 4, except if it is divisible by 100, in which case it still is a leap year if it is divisible by 400.
(defn leap-year? [year]
  (cond (= (mod year 400) 0) true
        (and
          (> (mod year 100) 0)
          (= (mod year 4) 0)) true
        :else false))


; '_______'
