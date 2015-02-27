(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false)
)

(defn abs [x]
  (if (< x 0) (* -1 x) (+ 0 x) )
  )


(defn divides? [divisor n]
  (= 0 (mod n divisor))
  )

(defn fizzbuzz [n]
(cond
 (divides? 15 n) "gotcha!"
 (divides?  5 n) "buzz"
 (divides?  3 n) "fizz"
 :else
 "")
  )

(defn teen? [age]
  (<= 13 age 19)
  )

(defn not-teen? [age]
  (not (teen? age))
  )

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else
   true
   )


  )

(defn leap-year? [year]
;if (year is not divisible by 4) then (it is a common year)
;else
;if (year is not divisible by 100) then (it is a leap year)
;else
;if (year is not divisible by 400) then (it is a common year)
;else (it is a leap year)

  (cond
   (not (divides? 4 year)) false
   (not (divides? 100 year)) true
   (not (divides? 400 year)) false
   :else
   true
   )

  )

; '_______'
