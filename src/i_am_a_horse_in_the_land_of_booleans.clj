(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if x "true" "false"))

(defn abs [n] (if (< n 0) (* -1 n) n))

(defn divides? [divisor n] (if (= 0 (mod n divisor)) "true" "false"))

(defn fizzbuzz [n]
  (cond
    (= "true" (divides? 15 n)) "gotcha!"
    (= "true" (divides? 5 n)) "buzz"
    (= "true" (divides? 3 n)) "fizz"
    :else "")
  )

(defn teen? [age] (if (> 20 age 12) "true" "false"))

(defn not-teen? [age]
  (cond
    (= "false" (teen? age)) true
    :else false
    ))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (cond
    (= "true" (and (divides? 4 year) (divides? 100 year) (divides? 400 year))) true
    (= "true" (and (divides? 4 year) (divides? 100 year))) false
    (= "true" (divides? 4 year)) true
    :else false
    ))

; '_______'
