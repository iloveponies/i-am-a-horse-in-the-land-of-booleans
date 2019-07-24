(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  ((comp not not) x))

(defn abs [x]
  (if (neg? x)
    (- x)
    x))

(defn divides? [divisor n]
  (zero? (mod n divisor)))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  ((comp not teen?) age))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (and (coll? x) (empty? x)) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (cond
   (divides? 100 year) (divides? 400 year)
   :else (divides? 4 year)))

; '_______'
