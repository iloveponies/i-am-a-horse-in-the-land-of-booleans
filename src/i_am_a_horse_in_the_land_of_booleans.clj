(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [param]
  (if param
    true
    false))

(defn abs [x]
  (if (>= x 0)
    x
    (- x)))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [number]
  (cond
    (divides? 15 number) "gotcha!"
    (divides? 3 number)  "fizz"
    (divides? 5 number)  "buzz"
    :else         ""))

(defn teen? [age]
  (if (and (> age 12) (< age 20))
    true
    false))


(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [number]
  (cond
    (number? number) (* 2 number)
    (empty? number)  nil
    (or (list? number) (vector? number))  (* 2 (count number))
    :else         true))

(defn leap-year? [year]
  (cond
    (not (divides? 4 year)) false
    (not (divides? 100 year))  true
    (not (divides? 400 year)) false
    :else         true))

; '_______'
