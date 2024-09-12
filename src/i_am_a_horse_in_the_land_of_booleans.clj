(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn
  boolean
  "Returns false for nil and false, true for anything else."
  [x]
  (if x true false))

(defn abs [n]
  (if (< n 0)
    (- 0 n)
    n))

(defn divides? [divisor n]
  (== (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
    (== (mod n 15) 0) "gotcha!"
    (== (mod n 5) 0) "buzz"
    (== (mod n 3) 0) "fizz"
    :else ""))

(defn
  teen?
  [age]
  (>= 19 age 13))

(defn not-teen? [age]
   (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* (count x) 2)
    (vector? x) (* (count x) 2)
    :else true
  )
)

(defn leap-year? [year]
  (and
    (== (mod year 4) 0)
    (or (not (== (mod year 100) 0))
        (== (mod year 400) 0) )

  )

)

; '_______'
