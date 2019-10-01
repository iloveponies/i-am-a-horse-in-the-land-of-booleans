(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if x true false))

(defn abs [x] (if (> x 0) x (* x -1)))

(defn divides? [divisor n] (if (== 0 (mod n divisor)) true false))

(defn fizzbuzz [n] (cond (divides? 15 n) "gotcha!" (divides? 5 n) "buzz" (divides? 3 n) "fizz" :else ""))

(defn teen? [age] (and (>= age 13) (<= age 19)))

(defn not-teen? [age] (not (teen? age)))

(defn generic-doublificate [x] (cond (number? x) (* 2 x) (empty? x) nil (or (list? x) (vector? x)) (* 2 (count x)) :else true))

(defn leap-year? [year]
  (cond
    (and (divides? 4 year) (not (divides? 100 year))) true
    (and (divides? 4 year) (divides? 400 year)) true
    :else false
    ))

; '_______'
