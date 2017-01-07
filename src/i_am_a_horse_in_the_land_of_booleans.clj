(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (not (or (= x nil) (= x false))))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (== (mod n divisor) 0))

(defn fizzbuzz [n]
  (if (and (divides? 3 n) (divides? 5 n))
    "gotcha!"
    (if (divides? 3 n)
      "fizz"
      (if (divides? 5 n)
      "buzz"
      ""))))

(defn teen? [age]
  (and (> age 12) (< age 20)))

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
  (or
    (divides? 400 year)
    (and
      (not (divides? 100 year))
      (divides? 4 year))))

; '_______'
