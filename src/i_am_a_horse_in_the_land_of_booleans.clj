(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (false? x) false (if (nil? x) false true)))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn teen? [age]
  (if (<= 13 age 19) true false))

(defn not-teen? [n]
  (if (teen? n) false true))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   :else true))

(defn leap-year? [year]
   (if (= (mod year 100) 0)
     (if (= (mod year 400) 0) true false)
     (if (= (mod year 4) 0) true false)))


; '_______'
