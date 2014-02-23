(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= nil x) (= false x))
    false)
    true)

(defn sign [x]
  (if (< x 0)
    "-"
    "+"))

(defn abs [x]
  (if (< x 0)
    (- x)
     x))

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotchya"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""))

(defn teen? [age]
  (and (> age 12 ) (< age 20)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) true
    (or (list? x) (vector? x)) (* 2 (count x ))
     :else true))

(defn leap-year? [year]
  (or
    (and (divides? 4 year) (not (divides? 100 year)))
    (and (divides? 4 year) (divides? 400 year))))


; '_______'
