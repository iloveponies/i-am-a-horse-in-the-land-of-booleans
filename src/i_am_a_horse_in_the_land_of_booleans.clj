(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false))
    false
    true)) ;; OK

(defn abs [n]
  (max n (- n)))
;; (abs -5) OK
(defn divides? [divisor n]
  (if (== (mod n divisor) 0) true false))
 ;; OK

(defn fizzbuzz
  [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))


(defn teen? [age]
  (if (and (>= age 13) (<= age 19))
    true false)) ;; OK
(defn not-teen? [age]
  (not (teen? age))) ;; ok

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (and (seqable? x) (empty? x)) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (cond
    (divides? 400 year) true
    (divides? 100 year) false
    (divides? 4 year) true
    :else false))
; '_______'