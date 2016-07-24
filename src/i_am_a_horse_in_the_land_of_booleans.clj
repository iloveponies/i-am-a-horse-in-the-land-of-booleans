(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
    false
    (if (= x false)
      false
      true)))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n)  "fizz"
    (divides? 5 n)  "buzz"
    :else           ""))

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
    (number? x)   (* x 2)
    (empty? x)    nil
    (list? x)     (* 2 (count x))
    (vector? x)   (* 2 (count x))
    :else         true))

(defn leap-year? [year]
  (cond
    (divides? 400 year)          true
    (and
      (divides? 4 year)
      (not (divides? 100 year))) true
    :else                        false))

; '_______'
