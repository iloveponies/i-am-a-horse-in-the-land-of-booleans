(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
     (= x nil)   false
     (= x false) false
     :else       true))

(defn abs [x]
  (if (neg? x) (- x) x))

(defn divides? [divisor n]
  (=(mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n)  "buzz"
    (divides? 3 n)  "fizz"
    :else           ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
     (number? x)                (* x 2)
     (empty? x)                 nil
     (or (list? x) (vector? x)) (* (count x) 2)
     :else                      true))

(defn leap-year? [year]
  (and (divides? 4 year) (if (divides? 100 year) (divides? 400 year) true)))

; '_______'
