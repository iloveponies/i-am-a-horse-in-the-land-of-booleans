(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false) )

(defn abs [x]
  (cond
    (> x 0) x
    :else (- x) ))

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""
    ))

(defn teen? [age]
  (and (> age 12) (< age 20)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (vector? x) (list? x)) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (cond
    (not= 0 (mod year 4)) false
    (not= 0 (mod year 100)) true
    (not= 0 (mod year 400)) false
    :else true))

; '_______'
