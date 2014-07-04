(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))


;;for nil and false, it returns false, and for all other values it returns true

(defn boolean [x]
  (if (or (= x nil) (= x false))
    false true))


;; returns the absolute value of n, i.e. if n<0, the value of (abs n) is −n, and otherwise n.

(defn abs [x]
 (if (<= x 0)
   (- x)
   x))


;; returns true if divisor divides n and false otherwise

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))


;; "fizz" when n is divisible by 3,
;; "buzz" when n is divisible by 5,
;; "gotcha!" when n is divisible by 15, and
;; the empty string "" otherwise.

(defn fizzbuzz [n]
  (cond
   (= (mod n 15) 0) "gotcha!"
   (= (mod n 5) 0) "buzz"
   (= (mod n 3) 0) "fizz"
   :else ""))


;; returns truthy if age is at least 13 and at most 19.
;; Use only one comparison operator and give it three arguments.

(defn teen? [age]
  (<= 13 age 19))


(defn not-teen? [age]
  ":(")


(defn generic-doublificate [x]
  ":(")


(defn leap-year? [year]
  ":(")


; '_______'
