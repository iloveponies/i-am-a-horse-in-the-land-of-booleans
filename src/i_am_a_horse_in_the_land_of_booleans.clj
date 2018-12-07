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
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (if (divides? 5 n)
    (if (divides? 3 n)
      "gotcha!"
      "buzz")
    (if (divides? 3 n)
      "fizz"
      "")))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true
    ))

(defn leap-year? [year]
    (cond
      (divides? 400 year) true
      (and (divides? 4 year) (divides? 100 year)) false
      (divides? 4 year) true
      :else false)
    )

; '_______'
