(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

( defn boolean [x]
  (not (or (nil? x) (false? x)))
  )


(defn abs [x]
(if (< x 0)
    (* -1 x)
    x)
)

(defn divides? [divisor n]
   (cond
    (== (mod n divisor) 0) true
    :else    false)
  )

(defn fizzbuzz [n]
   (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else         "")
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
    (or  (list? x) (vector? x)) (* 2 (count x))
    :else         true)

  )

(defn leap-year? [year]
  (cond
   (not (divides? 4 year )) false
   (not (divides? 100 year)) true
   (not (divides? 400 year)) false
    :else         true)
  )

; '_______'
