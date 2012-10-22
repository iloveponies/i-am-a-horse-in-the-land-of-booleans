(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
  (if x true false))

(defn abs [x]
  (if (<= x 0) (- x) x))

(defn divides? [divisor n]
  (== (mod n divisor) 0))

(defn fizzbuzz [n]
  (if (divides? 15 n) "gotcha!"
    (if (divides? 5 n) "buzz"
      (if (divides? 3 n) "fizz" ""))))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (if (number? x) (* 2 x)
    (if (empty? x) nil
      (if (or (list? x) (vector? x)) (* 2 (count x)) true))))

(defn leap-year? [year]
  (if (divides? 400 year) true
    (if (divides? 100 year) false (divides? 4 year))))