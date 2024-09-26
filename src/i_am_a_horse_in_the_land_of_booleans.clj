(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean
  "Works like the built-in `boolean' function."
  [x]
  (if (and (not= x false) (not= x nil))
    true
    false))

(defn abs [n]
  (if (< n 0)
    (* -1 n)
    n))

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3  n) "fizz"
   (divides? 5  n) "buzz"
   :else           ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x)                (* 2 x)
   (empty? x)                 nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else                      true))

(defn leap-year? [year]
    (cond
   (and (     divides? 4   year)
        (     divides? 100 year)
        (     divides? 400 year))  true
   (and (     divides? 4   year)
        (     divides? 100 year)
        (not (divides? 400 year))) false
   (and (     divides? 4   year)
        (not (divides? 100 year))) true
   (not (divides? 4 year))         false))
