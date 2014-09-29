(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (> x 0)
    x
    (- x x x)))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (if (= 0 (mod n 15))
    "gotcha!"
    (if (= 0 (mod n 5))
    "buzz"
    (if (= 0 (mod n 3))
      "fizz"
      ""
      ))))

(defn teen? [age]
  (if (< age 13)
    false
    (< age 20)))

(defn not-teen? [age]
  (if (not (teen? age))
    true
    false))

(defn generic-doublificate [x]
  (if (number? x)
    (* x 2)
    (if (empty? x)
      nil
      (if (list? x)
        (* (count x) 2)
        (if (vector? x)
          (* (count x) 2)
          true
          )))))

(defn leap-year? [year]
  (if (= 0 (mod year 400))
    true
    (if (= 0 (mod year 100))
      false
      (if (= 0 (mod year 4))
        true
        false
        ))))

; '_______'
