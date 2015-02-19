(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (not (or ( = false x) ( = nil x) )))

(defn abs [x] (max x (- x)))

(defn divides? [divisor n] (== 0 (mod n divisor )))

(defn fizzbuzz [n] (cond (divides? 15 n) "gotcha!" (divides? 5 n) "buzz" (divides? 3 n) "fizz" :else ""))

(defn teen? [age] (<= 13 age 19))

(defn not-teen? [age](not (<= 13 age 19)))

(defn generic-doublificate [x]
  (cond
  (number? x) (* 2 x)
  (empty? x) nil
  (or (vector? x) (list? x)) (* 2 (count x))
  :else true))

(defn leap-year? [year] (cond (== 0 (mod year 400)) true (== 0 (mod year 100)) false (== 0 (mod year 4)) true :else false))


; '_______'
;
