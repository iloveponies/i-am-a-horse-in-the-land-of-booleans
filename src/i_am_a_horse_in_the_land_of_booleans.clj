; vim:ft=scheme

(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (not (not x)))

(defn abs [x] (if (< x 0) (- x) x))

(defn divides? [divisor n] (== 0 (mod n divisor)))

(defn fizzbuzz [n]
      (cond (divides? 15 n) "gotcha!"
	    (divides? 3 n) "fizz"
	    (divides? 5 n) "buzz"
	    :else ""))

(defn teen? [age] (<= 13 age 19))

(defn not-teen? [age] (not (teen? age)))

(defn generic-doublificate [x]
      (cond (number? x) (+ x x)
	    (empty? x) nil
	    (or (list? x) (vector? x)) (generic-doublificate (count x))
	    :else true))

(defn leap-year? [year]
      (cond (divides? 400 year) true
	    (divides? 100 year) false
	    :else (divides? 4 year)))

; '_______'
