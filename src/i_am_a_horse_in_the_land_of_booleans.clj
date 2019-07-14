(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false))
  false
  true))

(defn abs [x]
  (if (> x 0)
  x
  (- x)))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
  true
  false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
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
  (number? x) (* x 2)
  (empty? x) nil
  (or (list? x) (vector? x)) (* 2 (count x))
  :else true)
)

(defn leap-year? [year]
  (if (divides? 4 year)
    (if (divides? 100 year)
      (if (divides? 400 year)
        true
      false)
    true)
  false)
)
; '_______'
