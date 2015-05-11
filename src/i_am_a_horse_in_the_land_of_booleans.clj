(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false)) false true ))

(defn abs [x]
  (if  (< x 0) (* x -1) x))

(defn divides? [divisor n]
  (if (= ( mod divisor n) 0) true false))

(defn fizzbuzz [n]
  (cond
    (divides? n 15) "gotcha"
    (divides? n 5) "buzz"
    (divides? n 3) "fizz"
    :else ""))

(defn teen? [age]
  (and (>= age 13) (<= age 19)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (vector? x) (* (count x) 2)
    (list? x) (* (count x) 2)
    :else true))

(defn leap-year? [year]
  (or (and (divides? year 4) (not (divides? year 100)))
      (and (divides? year 4) (divides? year 100) (divides? year 400))))

; '_______'