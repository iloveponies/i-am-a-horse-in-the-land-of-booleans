(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if x true false))

(defn abs [x]
  (if (< x 0) (- 0 x) x) )

(defn divides? [divisor n]
  (== 0 (mod n divisor) ) )

(defn fizzbuzz [n]
  (cond
    (== 0 (mod n 3) (mod n 5) ) "gotcha!"
    (== 0 (mod n 3) ) "fizz"
    (== 0 (mod n 5) ) "buzz"
    :else ""
    ))

(defn teen? [age]
   (<= 13 age 19) )

(defn not-teen? [age]
  (not (teen? age)))


(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (vector? x) (list? x)) (* (count x) 2)
    :else true
))

(generic-doublificate {:a 1})


(defn divisible-with [diviser value]
  (== 0 (mod value diviser)))

(defn leap-year? [year]
  (cond
    (and (divisible-with 100 year) (not (divisible-with 400 year))) false
    (divisible-with 4 year) true
    :else false)
  )



; '_______'
