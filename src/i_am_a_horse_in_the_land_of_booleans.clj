(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false)) false true))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (== 0 (mod n divisor)))

(defn fizzbuzz [n]
  (if (divides? 15 n)
    "gotcha!"
    (if (divides? 3 n)
      "fizz"
      (if (divides? 5 n)
        "buzz"
        ""))))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (if (number? x)
    (* 2 x)
    (if (empty? x)
      nil
      (if (or (list? x) (vector? x))
        (* 2 (count x))
        true))))

(defn leap-year? [year]
  (if (== (mod year 400) 0)
    true
    (if (== (mod year 100) 0)
      false
      (if (== (mod year 4) 0)
        true
        false))))

; '_______'
