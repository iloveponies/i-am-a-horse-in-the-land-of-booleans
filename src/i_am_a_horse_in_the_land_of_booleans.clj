(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (* x -1) x))

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
      (divides? 15 n) "gotcha!"
      (divides? 3 n) "fizz"
      (divides? 5 n) "buzz"
      :else (str)))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
    (cond
        (number? x) (* x 2)
        (empty? x) nil
        (list? x) (* (count x) 2)
        (vector? x) (* (count x) 2)
        :else true)
)

(defn leap-year? [year]
    (cond
        (divides? 400 year) true
        (and (divides? 4 year) (not (divides? 100 year))) true
        :else false
    ))

; '_______'
