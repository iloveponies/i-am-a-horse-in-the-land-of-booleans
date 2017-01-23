(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean "implements built-in boolean function w/o said function" [x]
  (if x true false))

(defn abs "returns the absolute value of a number" [x]
  (if (> x 0)
    x
	  (* x -1)))

(defn divides? "tests whether division produces no remainder" [divisor n] (== (mod n divisor) 0))

(defn fizzbuzz "returns a string based on divisibility" [n]
  (cond
    (== 0 (mod n 15)) "gotcha!"
    (== 0 (mod n 5)) "buzz"
    (== 0 (mod n 3)) "fizz"
    :else ""))

(defn teen? "returns truthy if age btwn 13-19 inclusive" [age]
  (<= 13 age 19))

(defn not-teen? "returns true if not teen, false if teen" [age]
  (if (not (teen? age))
    true
    false))

(defn generic-doublificate "dbls number, nil if {}, dbls list/vector length, or true" [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))

(defn leap-year? "determines if given year is a leap year" [year]
  (cond
    (and (== 0 (mod year 4)) (< 0 (mod year 100))) true
    (and (== 0 (mod year 4)) (== 0 (mod year 400))) true
    :else false))

; '_______'
