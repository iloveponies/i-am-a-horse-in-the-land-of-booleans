(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x false) (= x nil))
    false
    true))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (if (divides? 15 n)
    "gotcha!"
    (if (divides? 3 n)
      "fizz"
      (if (divides? 5 n)
        "buzz"
        ""))))

(defn teen? [age]
  (if (and (>= age 13) (<= age 19))
    true
    false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (if (number? x)
    (* x 2)
    (if (empty? x)
      nil
      (if (or (vector? x) (list? x))
        (* (count x) 2)
        true))))


(defn leap-year? [year]
  (if (not(divides? 4 year))
    false
    (if (not (divides? 100 year))
      true
      (if (not (divides? 400 year))
        false
        true))))

; '_______'

