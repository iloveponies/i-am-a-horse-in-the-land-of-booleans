(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
  true
  false))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))


(defn divides? [divisor n]
  (if (== 0(mod n divisor))
  true
  false))


(defn fizzbuzz [n]
  (cond
    (== 0 (mod n 15)) "gotcha!"
    (== 0 (mod n 5)) "buzz"
    (== 0 (mod n 3)) "fizz"
    :else ""))

(defn teen? [age]
  (if (< 12 age 20)
    true
    false))

(defn not-teen? [age]
  (if (teen? age)
    false
    true))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))


(defn leap-year? [year]
  (if (and (== (mod year 4) 0) (or (not (== (mod year 100) 0)) (== (mod year 400) 0)) )
      true
      false))


