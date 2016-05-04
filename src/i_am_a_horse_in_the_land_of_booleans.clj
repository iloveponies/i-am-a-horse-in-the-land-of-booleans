(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))



(defn divides? [divisor n]
  (= (mod n divisor) 0))


(defn fizzbuzz [n]
  (cond
    (and (divides? 5 n) (divides? 3 n)) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""))


(defn teen? [age]
  (and (<= age 19) (>= age 13)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (list? x) (vector? x)) (* (count x) 2)
    :else true))

(defn leap-year? [year]
  (cond
    (true? (divides? 400 year)) true
    (true? (divides? 100 year)) false
    (true? (divides? 4 year)) true
    :else false))


; '_______'
(fizzbuzz 1)
(and true true true false)
(= true)
