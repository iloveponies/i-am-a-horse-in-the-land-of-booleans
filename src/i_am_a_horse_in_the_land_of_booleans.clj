(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (not (or (= x nil) (= x false))))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (if (= 0 (mod n 15))
    "gotcha!"
    (if (= 0 (mod n 3))
        "fizz"
        (if (= 0 (mod n 5))
            "buzz"
            ""))))

(defn teen? [age]
  (if (< 12 age 20)
    true
    false))

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
  (if (divides? 4 year)
    (if (divides? 100 year)
        (if (divides? 400 year)
            true
            false)
        true)
    false))

; '_______'
