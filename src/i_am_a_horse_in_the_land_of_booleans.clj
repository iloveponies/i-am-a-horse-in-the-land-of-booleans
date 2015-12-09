(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (not(or (= x false)
       (= x nil))))

(defn abs [x]
  (if (< x 0)
    (- 0 x)
    x))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (if (divides? 15 n) "gotcha!"
    (if (divides? 3 n) "fizz"
      (if (divides? 5 n) "buzz"
        ""))))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (if (number? x) (* x 2)
    (if (empty? x) nil
      (if (or (list? x) (vector? x))
        (* 2 (count x))
        true))))

(defn leap-year? [year]
  (if (divides? 100 year)
    (divides? 400 year)
    (divides? 4 year)))

; '_______'
