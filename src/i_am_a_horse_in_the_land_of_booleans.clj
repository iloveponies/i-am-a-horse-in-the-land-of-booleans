(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (nil? x)
    false
    (if (false? x)
      false
      true)))

(defn abs [x]
  (if (>= x 0) x (- x)))


(defn divides? [divisor n]
  (= 0 (mod n divisor)))


(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""))

(defn teen? [age]
  (if (<= 13 age 19) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (or
    (divides? 400 year)
    (and
      (not (divides? 100 year))
      (divides? 4 year))))


; '_______'

(boolean nil)

(teen? 19)
(teen? 10)
(teen? 13)

(abs 10)
(abs -10)
(divides? 1 12)
(divides? 2 3)
(divides? 4 8)
(fizzbuzz 5)
(fizzbuzz 15)
(generic-doublificate 1)
(generic-doublificate "lul")
(generic-doublificate (list 1 2))
(not-teen? 20)
(leap-year? 4)
(- -10)
