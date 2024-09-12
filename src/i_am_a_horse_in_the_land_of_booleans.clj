(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  ":("
  (if x
    true
    false))

(defn abs [x]
  ":("
  (if (= x 0)
    0
    (if (< x 0)
      (- x)
      x)))

(defn divides? [divisor n]
  ":("
  (if (= 0 (mod n divisor))
    true
    false))


(defn fizzbuzz [n]
  ":("
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? [age]
  ":("
  (if (< age 13)
    false
    (< age 20) ))

(defn not-teen? [age]
  ":("
  (not (teen? age)))

(defn generic-doublificate [x]
  ":("
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2(count x))
    :else true))

(defn leap-year? [year]
  ":("
  (cond
    (not (divides? 4 year)) false
    (divides? 100 year) (divides? 400 year)
    :else true
    ))

; '_______'
