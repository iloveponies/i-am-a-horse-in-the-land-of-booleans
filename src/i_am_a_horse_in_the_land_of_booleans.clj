(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
    "Return false for nil and false, true for everything else"
    (if x true false))


(defn abs [x]
    "Get absolute value of the value"
    (if (< x 0)
        (* -1 x)
        x))

(defn divides? [divisor n]
  "Check for divides"
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
    "Fizzbuzz 3, 5, 15"
    (cond
        (= (mod n 15) 0) "gotcha!"
        (= (mod n 5) 0) "buzz"
        (= (mod n 3) 0) "fizz"
        :else ""))

(defn teen? [age]
    "Determine age is between 13 and 19"
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
    (cond
        (number? x) (* 2 x)
        (empty? x) nil
        (list? x) (* 2 (count x))
        (vector? x) (* 2 (count x))
        :else true ))

(defn leap-year? [year]
    "Determine year is a leap year"
    (cond
        (= 0 (mod year 400)) true
        (= 0 (mod year 100)) false
        (= 0 (mod year 4)) true
        :else false ))
