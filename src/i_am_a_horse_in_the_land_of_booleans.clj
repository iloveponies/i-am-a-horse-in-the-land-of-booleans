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
  (if (== (mod n divisor) 0)
   true
   false))

(defn fizzbuzz [n]
  (if (divides? 15 n)
    "gotcha!"
    (if (divides? 5 n)
      "buzz"
      (if (divides? 3 n)
        "fizz"
        ""))))

(defn teen? [age]
  (< 12 age 20)
)

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* (count x) 2)
    (vector? x) (* (count x) 2)
    :else true))

(defn leap-year? [year]
  (if (divides? 4 year)
    (if (divides? 100 year)
      (if (divides? 400 year)
        true
        false)
      true)
    false))

; '_______'
