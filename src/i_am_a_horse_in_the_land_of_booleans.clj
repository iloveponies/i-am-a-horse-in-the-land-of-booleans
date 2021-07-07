(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= false x)
    false
    (if (= nil x)
      false
      true)))


(defn abs [x]
  (if (> x 0)
    x
    (- x)))

(defn divides? [divisor n]
  (== 0 (mod n divisor)))


(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (and (list? x) (empty? x)) nil
   (and (map? x) (empty? x)) nil
   (and (vector? x) (empty? x)) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true
   ))

(defn leap-year? [year]
   (or
    (and
     (not (== (mod year 100) 0))
     (== (mod year 4) 0))
    (== (mod year 400) 0)))


; '_______'
