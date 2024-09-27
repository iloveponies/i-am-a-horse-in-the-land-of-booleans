(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
    (= x nil) false
    (= x false) false
    :else true))

(defn abs [x]
  (if (< 0 x)
    x
    (- x)))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
    (= (mod n 15) 0) "gotcha!"
    (and (= (mod n 3) 0) (not= (mod n 5) 0)) "fizz"
    (and (= (mod n 5) 0) (not= (mod n 3) 0)) "buzz"
    :else ""))

(defn teen? [age]
  (if (and (< 12 age) (< age 20))
    true
    false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (or (and (divides? 4 year) (not (divides? 100 year))) (divides? 400 year)))

(leap-year? 400)

; '_______'
