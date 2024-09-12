(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn sign [x]
  (if (< x 0)
    "-"
    "+"))

(defn super-sign [number]
  (cond
    (neg? number) "negative"
    (pos? number) "positive"
    :else "zero"))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""))

(defn teen? [age]
  (if (<= 13 age 19)
    true
    false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (list? x) (* (count x) 2)
    (vector? x) (* (count x) 2)
    :else true))

(defn leap-year? [year]
  (or
    (and (divides? 4 year)
        (not (divides? 100 year)))
    (divides? 400 year)))

; '_______'
