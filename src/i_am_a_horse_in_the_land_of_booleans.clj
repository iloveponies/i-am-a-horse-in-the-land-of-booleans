(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean "returns false if x is false or nil" [x] 
  (if x true false))

(defn abs "Returns the absolute value of x" [x]
  (if (< x 0) (- x) (+ x)))

(defn divides? "returns true if divisor divides n exactly" [divisor n]
  (if (== divisor 0) true (if (== (mod n divisor) 0) true false)))

(defn fizzbuzz "A very long expl here" [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? "Return truthy if age >=13 and <= 19" [age]
  ( if (> 20 age 12) true false))

(defn not-teen? "returns the negative of teen?"[age]
  (not (teen? age)))

(defn generic-doublificate "A very mysterious function"[x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))

(defn leap-year? "Return true if year is a leap year" [year]
  (cond
    (== (mod year 400) 0) true
    (and (== (mod year 4) 0) (not (== (mod year 100) 0))) true
    :else false))

; '_______'
