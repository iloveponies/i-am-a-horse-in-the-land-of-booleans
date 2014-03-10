(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (== 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))


(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))

;Exercise 8
;Write the function (leap-year? year), which returns true if year is a leap year, otherwise false. A year is a leap year if it is divisible by 4, except if it is divisible by 100, in which case it still is a leap year if it is divisible by 400.
;See Wikipedia for a simple pseudocode solution.
;(leap-year? 100) ;=> false
;(leap-year? 200) ;=> false
;(leap-year? 400) ;=> true
;(leap-year? 12)  ;=> true
;(leap-year? 20)  ;=> true
;(leap-year? 15)  ;=> false

(defn leap-year? [year]
  (or (divides? 400 year)
    (and
      (divides? 4 year)
      (not (divides? 100 year)))))

; '_______'
