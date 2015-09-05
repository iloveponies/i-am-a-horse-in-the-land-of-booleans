(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
    (* x -1)
    (* x 1)))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else n
   ))

(defn teen? [age]
  (if (< 12 age 20) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (list? x) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (cond
   (= 0 (mod year 400)) true
   (= 0 (mod year 100)) false
   (= 0 (mod year 4)) true
   :else false
   ))

; '_______'
