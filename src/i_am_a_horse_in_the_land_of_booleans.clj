(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false)) false true))

(defn abs [n] (if (< n 0) (- n) n))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor)) true false ))

(defn fizzbuzz [n]
  (cond
   (= 0 (mod n 15)) "gotcha!"
   (= 0 (mod n 5)) "buzz"
   (= 0 (mod n 3)) "fizz"
   :else ""))

(defn teen? [age]
  (def young 13) (def old 19)
  (if (<= young age old) true false))

(defn not-teen? [age]
  (if (not (teen? age)) true false))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)                                      ;
   (empty? x) nil
   (or (vector? x) (list? x)) (* 2 (count x)) 
   :else true))

(defn leap-year? [year]
  (cond
   (not (= 0 (mod year 4))) false
   (not (= 0 (mod year 100))) true
   (= 0 (mod year 400)) true
   :else false))

; '_______'
