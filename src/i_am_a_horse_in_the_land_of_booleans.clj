(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (nil? x) (false? x)) false true)
  )

(defn abs [x]
  (if (< x 0) (- x) x)
  )

(defn divides? [divisor n]
  (if (< n divisor) false
    (if (= 0 (mod n divisor))
      true
      false)))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""))

(defn teen? [age]
  (if (and (>= age 13) (<= age 19)) true false)
  )

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true
  ))

(defn leap-year? [year]
  (if (divides? 4 year)
    (cond
     (divides? 400 year) true
     (divides? 100 year) false
     :else true)
    false))

; '_______'
