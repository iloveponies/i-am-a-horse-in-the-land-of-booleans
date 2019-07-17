(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (false? x) (nil? x))
    false
    true))

(defn abs [x]
  (if (< x 0)
    (- 0 x)
    x))

(defn divides? [divisor n]
  (== (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n)  "gotcha!"
   (divides? 3 n)   "fizz"
   (divides? 5 n)   "buzz"
   :else            ""))

(defn teen? [age]
  "Returns true if age param is between 13 and 19"
  (<= 13 age 19))

(defn not-teen? [age]
  (cond
   (not (teen? age))   true
   :else               false))

(defn generic-doublificate [x]
  (cond
   (number? x)                  (* x 2)
   (empty? x)                   nil
   (or (list? x) (vector? x))   (* (count x) 2)
   :else                        true
   ))

(defn leap-year? [year]
  (cond
   (not (divides? 4 year))   false
   (not (divides? 100 year)) true
   (divides? 400 year)       true
   :else                     false))

; '_______'
