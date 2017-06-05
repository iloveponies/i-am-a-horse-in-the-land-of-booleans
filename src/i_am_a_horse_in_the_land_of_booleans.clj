(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
    (= x nil) false
    (= x false) false
    :else true))

(defn abs [x]
  (if (< x 0)
    (* x -1)
    x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
    (= (mod n 15) 0) "gotcha!"
    (= (mod n 3) 0) "fizz"
    (= (mod n 5) 0) "buzz"

    :else ""))

(defn teen? [age]
  (if (<= 13 age 19) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (= (number? x) true) (* 2 x)
    (= (empty? x) true) nil
    (= (list? x) true) (* 2 (count x))
	(= (vector? x) true) (* 2 (count x))
    :else true))

(defn leap-year? [year]
 (cond
    (> (mod year 4) 0) false
    (> (mod year 100) 0) true
    (> (mod year 400) 0) false
    :else true))

; '_______'
