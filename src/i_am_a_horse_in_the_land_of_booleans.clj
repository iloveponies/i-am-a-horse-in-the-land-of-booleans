(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (== (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
   (= 0 (mod n 15)) "gotcha!"
   (= 0 (mod n 3)) "fizz"
   (= 0 (mod n 5)) "buzz"
   :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (cond
   (not (divides? 4 year)) false
   (not (divides? 100 year)) true
   (not (divides? 400 year)) false
   :else true))

; '_______'

(defn sign [x]
  (if (< x 0)
    "-"
    "+"))

(defn super-sign
  [number]
  (cond
   (neg? number) "negative"
   (pos? number) "positive"
   :else "zero"))
