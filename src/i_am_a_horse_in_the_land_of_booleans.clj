(ns i-am-a-horse-in-the-land-of-booleans
    (:refer-clojure :exclude [boolean]))

(defn boolean [x]
      (if x
        true
        false))

(defn abs [x]
      (if (< x 0) (- x) x))

(defn divides? [divisor n]
      (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
      (cond
        (=  (mod n 15) 0) "gotcha!"
        (=  (mod n 3) 0) "fizz"
        (=  (mod n 5) 0) "buzz"
        :else ""))

(defn teen? [age]
      (<= 13 age 19))

(defn not-teen? [age]
      (not (teen? age)))

(defn generic-doublificate [x]
      (cond
        (number? x) (* x 2)
        (empty? x) nil
        (list? x) (* (count x) 2)
        (vector? x) (* (count x) 2)
        :else true
        ))

(defn leap-year? [year]
      (cond
        (and (divides? 100 year) (divides? 400 year)) true
        (and (divides? 100 year) (divides? 4 year)) false
        (divides? 4 year) true
        :else false
        ))