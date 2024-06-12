(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
   (nil? x) false
   (false? x) false
   :else true))

(defn abs [x]
  (if (pos? x)
    x
    (* -1 x)))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"  
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""))

(defn teen? [age]
  (> 20 age 12))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (vector? x) (* 2 (count x))
   (list? x) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (if (divides? 400 year) true
      (and (divides? 4 year)
           (not (divides? 100 year)))))
; '_______'
