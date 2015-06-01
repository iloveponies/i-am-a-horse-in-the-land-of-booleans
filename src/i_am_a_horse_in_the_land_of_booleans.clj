(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond (= (mod n 15) 0) "gotcha!"
        (= (mod n 3) 0) "fizz"
        (= (mod n 5) 0) "buzz"
        true ""))

(defn teen? [age]
  (if (< 12 age 20) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond (number? x) (* x 2)
        (empty? x) nil
        (or  (list? x) 
             (vector? x)) (* (count x) 2)
        true true))

(defn leap-year? [year]
  (if (> (mod year 4) 0)
    false
    (if (> (mod year 100) 0)
      true
      (if (> (mod year 400) 0)
        false
        true))))

; '_______'
