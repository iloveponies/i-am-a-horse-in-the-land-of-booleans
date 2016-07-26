(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (false? x) (nil? x)) false true))

(defn abs [x]
  (if (> x 0) x (- x)))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor)) true false))

(defn fizzbuzz [n]
  (if (divides? 15 n) "gotcha!"
     (if (divides? 5 n) "buzz"
        (if (divides? 3 n) "fizz"
            ""))))

(defn teen? [age]
  (if (and (>= age 13) (<= age 19)) true false))

(defn not-teen? [age]
  (if (teen? age) false true))

(defn generic-doublificate [x]
  (if (number? x) (* x 2)
    (if (empty? x) nil
       (if (or (list? x) (vector? x)) (* (count x) 2)
          true))))

(defn leap-year? [year]
  (if (divides? 400 year) true
    (if (divides? 100 year) false
      (if (divides? 4 year) true
        false))))

; '_______'
