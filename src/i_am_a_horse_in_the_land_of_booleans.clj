(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
   (= x nil) false
   (= x false) false
   :else true))


(defn abs [x]
  (if (> x 0)
      x
      (* -1 x)))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3  n) "fizz"
   (divides? 5  n) "buzz"
   :else ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
)

(defn leap-year? [year]
  (cond
   (not (divides? 4 year)) false
   (not (divides? 100 year)) true
   (not (divides? 400 year)) false
   :else true))


;if (year is not divisible by 4) then (it is a common year)
;else
;if (year is not divisible by 100) then (it is a leap year)
;else
;if (year is not divisible by 400) then (it is a common yeaar)
;else (it is a leap year)
; '_______'
