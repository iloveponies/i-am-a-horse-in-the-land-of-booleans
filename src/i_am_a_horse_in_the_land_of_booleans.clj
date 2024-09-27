(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false))
    false
    true))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x)
  )

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else  ""))



(defn teen? [age]
  (and (<= age 19) (>= age 13)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]

  (cond
    (number? x) (* 2 x)
    (empty?  x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
   :else true
  ))

(defn leap-year? [year]
  (cond
   (divides? 400 year) true
   (divides? 100 year) false
   (divides? 4   year) true
   :else  false
   ))
; '______'
