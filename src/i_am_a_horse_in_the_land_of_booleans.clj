(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false)

  )

(defn abs
  "eturns the absolute value of n"
  [x]
  (if (< x 0)
    (- x)
    x
    ))

(defn divides?
  "Returns true if divisor divides n"
  [divisor n]
  (== 0 (mod n divisor)))


(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else  ""
   ))

(defn teen?
  "Age is at least 13 and at most 19."
  [age]
  (< 12 age 20))

(defn not-teen? [age]
  (if (teen? age) false true)
  )

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (or (list? x) (vector? x)) (* (count x) 2)
   :else true
   ))

(defn leap-year?
  "Returns true if year is a leap year, otherwise false."
  [year]
  (and (divides? 4 year)
       (not (and (divides? 100 year)
                 (not (divides? 400 year))
            )
       )
  )
)

; '_______'


(leap-year? 200)




