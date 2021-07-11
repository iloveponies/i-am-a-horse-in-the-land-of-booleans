(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  "Convert argument to logical representation"
  (cond
   (false? x) false
   (nil? x) false
   :else  true))

(defn as-boolean [x]
  (boolean x))

(defn abs [x]
  (cond
   (pos? x) x
   (neg? x) (* -1 x)
   :else 0))

(defn divides? [divisor n]
  (if (zero? (mod n divisor)) true false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))


(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))


(defn leap-year? [year]
  (cond
   (divides? 400 year) true
   (divides? 100 year) false
   (divides? 4 year) true
   :else false))


