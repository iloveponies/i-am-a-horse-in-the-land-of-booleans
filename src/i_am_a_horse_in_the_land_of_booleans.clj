(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
    (- 0 x)
    x
  ))

(defn divides? [deler n]
  (if (= 0 (mod n deler))
    true
    false
    ))

;"fizz" when n is divisible by 3,
;"buzz" when n is divisible by 5,
;"gotcha!" when n is divisible by 15, and
;the empty string "" otherwise.
(defn fizzbuzz [n]
  (cond
   (= 0 (mod n 15)) "gotcha!"
   (= 0 (mod n 3)) "fizz"
   (= 0 (mod n 5)) "buzz"

    :else ""

  ))

(defn teen? [age]
  (if (< 12 age 20)
       true
       false
       ))

(defn not-teen? [age]
  (not (teen? age))
  )


(defn generic-doublificate [x]
  (cond
     (number? x) (* x 2)
     (empty? x) nil
     (list? x) (* 2 (count x))
     (vector? x) (* 2 (count x))
     :else true
   )
)

;if (year is not exactly divisible by 4) then (it is a common year)
;else if (year is not exactly divisible by 100) then (it is a leap year)
;else if (year is not exactly divisible by 400) then (it is a common year)
;else (it is a leap year
(defn leap-year? [year]
  (cond
     (not (= 0 (mod year 4))) false
     (not (= 0 (mod year 100))) true
     (not (= 0 (mod year 400))) false
    :else true  ))

; '_______'
