(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (== 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond (divides? 3 n) "fizz"
        (divides? 5 n) "buzz"
        (divides? 15 n) "gotcha!"
        :else ""))

(defn teen? [age]
  (< 13 age 19))

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  (cond (number? x) (* 2 x)
        (or (list? x) (vector? x))
            (if (empty? x) nil (*2 (count x))))
        :else true)

(defn leap-year? [year]
  ":(")

; '_______'
