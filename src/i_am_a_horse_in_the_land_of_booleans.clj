(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (and (not= x false) (not= x nil)))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
   (== n 0)         ""
   (divides? 15 n)  "gotcha!"
   (divides? 3 n)   "fizz"
   (divides? 5 n)   "buzz"
   :else            ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x)                  (* 2 x)
   (empty? x)                   nil
   (or (vector? x) (list? x))   (* 2 (count x))
   :else                        true))

(defn leap-year? [year]
  (if (and (== (mod year 4) 0)
           (or (not= (mod year 100) 0) (== (mod year 400) 0)))
  true
  false
  ))

; '_______'
