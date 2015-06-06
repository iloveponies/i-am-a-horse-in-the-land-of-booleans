(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  "Reimplement clojure boolean function"
  (not (or (nil? x)
           (false? x))))

(defn abs [x]
  "Return absolute value of a number."
  (if (neg? x)
    (* -1 x)
    x))

(defn divides? [divisor n]
  "If n divided by divisor does not produce a remainder, return true.  
  Otherwise return false."
  (if (zero? (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond (divides? 15 n) "gotcha!"
        (divides? 5 n) "buzz"
        (divides? 3 n) "fizz"
        :else ""))

(defn teen? [age]
  "Accepts an integer age and returns true if it is in the teens."
  (< 12 age 20))

(defn not-teen? [age]
  "Returns false if the age is in the teens and true otherwise"
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond (number? x) (* 2 x)
        (empty? x) nil
        (or (list? x) (vector? x)) (* 2 (count x))
        :else true))

(defn leap-year? [year]
  "Returns true if a given year is a leap year and false otherwise."
  (cond (divides? 400 year) true
        (divides? 100 year) false
        (divides? 4 year) true
        :else false))

; '_______'

