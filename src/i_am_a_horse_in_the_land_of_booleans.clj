(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if x true false))

(defn abs [n] (if
                (< n 0)
                (* -1 n)
                n))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""))

(defn teen? [age] (if (<= 13 age 19) true false))

(defn not-teen? [age]
  (if (teen? age) false true))

(defn generic-doublificate [n]
  (cond
   (number? n) (* n 2)
   (empty? n) nil
   (or (list? n) (vector? n)) (* 2 (count n))
   :else true))

(defn leap-year? [year]
  (cond
   (= (mod year 400) 0) true
   (and (= (mod year 4) 0)
        (not (= (mod year 100) 0))) true
    :else false))

; '_______'
