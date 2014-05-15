(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

;; Any -> Bool
;; Turns everything to boolean
(defn boolean [x]
  (if (or (nil? x) (= false x))
    false
    true))

;; Number -> Number
;; Return the absolute value
(defn abs [x]
  (if (< x 0)
    (- x)
    x))

;; Number -> Bool
;; Return True if divisible
(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

;; Exercise 5
;; Write the function (fizzbuzz n) that returns
;; "fizz" when n is divisible by 3,
;; "buzz" when n is divisible by 5,
;; "gotcha!" when n is divisible by 15, and
;; the empty string "" otherwise.
;; Use the divides? function from the previous exercise.
(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides?  3 n) "fizz"
   (divides?  5 n) "buzz"
   :else ""))

;; Number -> Bool

(defn teen? [age]
  (if (and (>= age 13) (<= age 19))
    true
    false))

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
