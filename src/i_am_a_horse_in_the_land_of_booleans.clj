(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (nil? x) (false? x))
    false
    true))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
   (and (== 0 (mod n 5)) (== 0 (mod n 3))) "gotcha!"
   (== 0 (mod n 3)) "fizz"
   (== 0 (mod n 5)) "buzz"
   :else ""))

(defn teen? [age]
  "true if age >= 13 and <= 19"
  (if (and (>= age 13) (<= age 19))
    true
    false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  "(generic-doublificate 1)        ;=> 2
   (generic-doublificate [1 2])    ;=> 4
   (generic-doublificate '(65 21)) ;=> 4
   (generic-doublificate {})       ;=> nil
   (generic-doublificate [])       ;=> nil
   (generic-doublificate {:a 1})   ;=> true"
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true)
  )

(defn leap-year? [year]
  "Write the function (leap-year? year), which returns true if year is a leap
   year, otherwise false.

   A year is a leap year if it is divisible by 4, except if
   it is divisible by 100, in which case it still is a leap year if it is
   divisible by 400."
  (if (divides? 4 year)
    (if (divides? 100 year)
      (if (divides? 400 year) true false)
      true)
    false)
  )

; '_______'
