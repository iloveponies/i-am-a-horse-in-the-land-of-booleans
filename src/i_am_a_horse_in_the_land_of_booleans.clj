(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
  (if x true false))

(defn abs [x]
  (if (>= x 0) x (- x)))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
    (== (mod n 15) 0) "gotcha!"
    (== (mod n 5) 0) "buzz"
    (== (mod n 3) 0) "fizz"
    :else ""))

(defn teen? [age]
  (if (> 20 age 12) true false))

(defn not-teen? [age]
  (if (or (> age 19) (< age 13)) true false))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (if (== (mod year 4) 0)
    (if (not (== (mod year 100) 0))
      true
      (if (== (mod year 400) 0)
         true
         false))
    false))

; '_______'
