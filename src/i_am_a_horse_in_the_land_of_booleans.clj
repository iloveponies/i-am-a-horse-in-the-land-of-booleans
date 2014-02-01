(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))



(defn boolean [x] (if (= x nil) false (if (= x false) false true)))

(defn teen? [x] (<= 13 x 19))

(defn abs [n] (if (< n 0) (- n) n))

(defn divides? [divisor n] (if (> (mod n divisor) 0) false true))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    :else
      (cond
        (list? x) (* (count x) 2)
        (vector? x) (* (count x) 2)
        :else true)))

(defn not-teen? [age] (not (teen? age)))

(defn leap-year? [year]
  (if (divides? 400 year)
    true
    (if (divides? 100 year)
      false
      (if (divides? 4 year) true false))))


; '_______'
