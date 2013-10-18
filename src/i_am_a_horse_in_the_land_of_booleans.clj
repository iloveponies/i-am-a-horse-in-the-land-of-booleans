(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  ":3"
  (if x true false)
  )

(defn abs [x]
  ":3"
  (if (< x 0) (- x) x)
  )


(defn divides? [divisor n]
  ":3"
  (if (== (mod n divisor) 0) true false)
  )


(defn fizzbuzz [n]
  ":3"
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""
   )
  )

(defn teen? [age]
  ":3"
  (<= 13 age 19)
  )

(defn not-teen? [age]
  ":3"
  (not (teen? age))
  )

(defn generic-doublificate [x]
  ":3"
  (cond
   (number? x) (+ x x)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   :else true
   )
  )

(defn leap-year? [year]
  ":3"
  (cond
   (divides? 400 year) true
   (divides? 100 year) false
   (divides? 4 year)   true
   :else false
   )
  )

; '_______'
