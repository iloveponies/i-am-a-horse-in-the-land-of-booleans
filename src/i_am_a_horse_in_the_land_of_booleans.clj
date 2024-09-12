(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (not (contains? #{false nil} x)))

(defn abs [y] (if (< y 0)
                (- y)
                y))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
    (= (mod n 15) 0) "gotcha!"
    (= (mod n 5)  0)  "buzz"
    (= (mod n 3)  0)  "fizz"
    true ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
   (cond
     (number? x) (* 2 x)
     (empty? x) nil
     (or (list? x)
         (vector? x)) (* 2 (count x))
      true true))

(defn leap-year? [year]
  (or (and (= (mod year 4) 0)
           (> (mod year 100) 0))
      (and (= (mod year 4) 0)
           (= (mod year 100) 0)
           (= (mod year 400) 0))))

