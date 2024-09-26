(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (> x  0) x (- x)))

(defn divides? [divisor n]
   (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  [n]
  (if (divides? 15 n)
    "gotcha!"
    (if (divides? 5 n)
    "buzz"
    (if (divides? 3 n)
    "fizz"
    ""))))


(defn teen? [age]
  [age]
  (and (<= age 19) (>= age 13)))


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
  (if (not (divides? 4 year))
    false
    (if (not (divides? 100 year))
      true
      (if (not (divides? 400 year))
        false
        true))))

; '_______'
