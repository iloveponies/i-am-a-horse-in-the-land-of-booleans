(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if x (= x x) (= x 1)))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if-not (= 0 (mod n divisor)) false true))

(defn fizzbuzz [n]
  (cond
    ;(divides? 3 n) (if (divides? 5 n) "gotcha!" "fizz")
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""
    ))

(defn teen? [age] (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true
  ))

(defn leap-year? [year]
  (cond
    (divides? 4 year) (if (divides? 100 year) (divides? 400 year) false)
    :else false
    ))
