(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (not
    (or (= x nil) (= x false))))

(defn abs [x]
  (if (< x 0)
    (* x -1)
    x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (or (list? x) (vector? x)) (* (count x) 2)
   :else true))

(defn leap-year? [year]
  (if (and (divides? 4 year)
           (or (not (divides? 100 year))
               (divides? 400 year)))
    true
    false))

; '_______'
; A year is a leap year if it is divisible by 4,
; except if it is divisible by 100, in which case
; it still is a leap year if it is divisible by 400.

(leap-year? 100) ;=> false
(leap-year? 200) ;=> false
(leap-year? 400) ;=> true
(leap-year? 12)  ;=> true
(leap-year? 20)  ;=> true
(leap-year? 15)  ;=> false
