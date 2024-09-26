(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (zero? (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (and (divides? 5 n)
         (divides? 3 n)) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? [age]
  (and (> age 12)
       (< age 20)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) 2
    (empty? x) nil
    (map? x) true
    (coll? x) 4))

(defn leap-year? [year]
  (or
    (divides? 400 year)
    (and
    (divides? 4 year)
    (not (divides? 100 year)))))

; '_______'