(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false)
  )

(defn abs [x]
  (if (> 0 x) (- 0 x) x)
  )

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""
   )
  )

(defn teen? [age]
  (if (< 12 age 20) true false)
  )

(defn not-teen? [age]
  (not (teen? age))
  )

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (or (list? x) (vector? x)) (if (empty? x) nil (* 2 (count x)))
   (and (coll? x) (empty? x)) nil
   :else true
   )
  )

(defn leap-year? [year]
  (and (divides? 4 year) (or (not (divides? 100 year)) (divides? 400 year)))
  )

; '_______'
