(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false)
  )

(defn abs [x]
  (if (< x 0) (- 0 x) x)
  )

(defn divides? [divisor n]
  (if (== 0 (mod n divisor)) true false))

(defn fizzbuzz [n]
  (cond
   (and (divides? 3 n) (divides? 5 n)) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else "")
  )

(defn teen? [age]
  (if (and (>= age 13) (<= age 19)) true false)
  )

(defn not-teen? [age]
  (if (not (teen? age)) true false))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (if (not (divides? 4 year)) false
    (if (not (divides? 100 year)) true
      (if (not (divides? 400 year)) false true)))
  )


; '_______'
