(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
(if x true false))

(defn teen? [age]
(if (<= 13 age 19) true false))

(defn abs [n]
(if (< n 0) (* -1 n) n))

(defn divides? [divisor, n]
(if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
(cond
(divides? 15 n) "gotcha!"
(divides? 5 n) "buzz"
(divides? 3 n) "fizz"
:else ""))

(defn generic-doublificate [x]
(cond
(number? x) (* 2 x)
(empty? x) nil
(list? x) (* 2 (count x))
(vector? x) (* 2 (count x))
:else true))

(defn not-teen? [x]
(not (<= 13 x 19)))

(defn leap-year? [year]
(cond
(divides? 400 year) true
(divides? 100 year) false
(divides? 4 year) true
:else false))

; '_______'
