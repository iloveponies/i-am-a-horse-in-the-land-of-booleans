(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
      (* x -1)
      x))

(defn divides? [divisor n]
  (== 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else      ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (+ x x)
    (zero? (count x)) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true)
  )

(defn leap-year? [year]
  (cond (zero? (mod year 400)) true
        (zero? (mod year 100)) false
        (zero? (mod year 4)) true
        :default false))

; '_______'

(defn sign [x]
  (if (< x 0)
      "-"
      "+"))
