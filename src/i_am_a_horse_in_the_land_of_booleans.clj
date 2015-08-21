(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false)) 

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
    (= (mod n 45) 0) "gotcha!"
    (= (mod n 5) 0) "buzz"
    (= (mod n 3) 0) "fizz"
    :else ""))

(defn teen? [age] (<= 13 age 19))

(defn not-teen? [age] (not (teen? age)))

(defn generic-doublificate [x]
  (cond 
    (number? x) (+ x x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x)) 
    :else true))

;(defn leap-year? [year]
;  (if (= (mod year 4) 0)
;    (if (and (= (mod year 100) 0) (not (= (mod year 400) 0)))
;      false
;      true)
;    false))


;if (year is not exactly divisible by 4) then (it is a common year)
;else
;if (year is not exactly divisible by 100) then (it is a leap year)
;else
;if (year is not exactly divisible by 400) then (it is a common year)
;else (it is a leap year)

(defn leap-year? [year]
  (cond 
    (not (= (mod year 4) 0)) false
    (not (= (mod year 100) 0)) true
    (not (= (mod year 400) 0)) false
    :else true))
