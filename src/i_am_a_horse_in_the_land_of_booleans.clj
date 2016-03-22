(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn returnLength [structure]
  (count structure))

(defn mulitplyLength [n structure]
  (* n (returnLength structure)))

(defn boolean [x]
    (if x
    true false)
  )

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true false))

(defn fizzbuzz [n]
    (cond
    (and (divides? 3 n) (divides? 5 n)) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""
    ))

(defn teen? [age]
  (if (<= 13 age 19)
    true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (vector? x) (mulitplyLength 2 x)
    (list? x) (mulitplyLength 2 x)
    :else true
    ))

(defn leap-year? [year]
  (cond
    (and (divides? 4 year) (not (divides? 100 year))) true
    (and (divides? 4 year) (divides? 100 year) (divides? 400 year)) true
    :else false
    ))

; '_______'
