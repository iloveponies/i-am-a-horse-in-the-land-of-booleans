(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
   (nil? x) false
   (false? x) false
   :else true))

(defn abs [x]
  (if (neg? x) (- x) x))

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn teen? [age]
  (and (> age 12)(< age 20)))

(defn not-teen? [age]
  (not(teen? age)))

(defn double-length [coll]
  (* 2 (count coll)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (double-length x)
   (vector? x) (double-length x)
   :else true))

(defn leap-year? [year]
  (cond
   (= 0 (mod year 400)) true
   (= 0 (mod year 100)) false
   :else (= 0 (mod year 4))))

; '_______'
