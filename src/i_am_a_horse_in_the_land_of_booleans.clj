(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
    (or (nil? x) (= x false)) false
    :else true))

(defn abs [x]
  (cond
    (< x 0) (- x)
    :else x))

(defn divides? [divisor n]
  (== 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
:else ""))

(defn teen? [age]
  (and (>= age 13) (<= age 19)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* (count x) 2)
    :else true))

(defn leap-year? [year]
  (cond
    (and (divides? 4 year) (not (divides? 100 year))) true
    (and (divides? 4 year) (divides? 100 year) (divides? 400 year)) true
    :else false))

; '_______ good suggestion to leap function. reference:https://github.com/iloveponies/i-am-a-horse-in-the-land-of-booleans/pull/1635/files#diff-da781cd1b0ea7665718303864d05bcfae519b903d4b057d06dc869b9a9416cbaR55'
;(defn leap-year? [year]
;  (cond
;    (not(divides? 4 year)) false
;    (not(divides? 100 year)) true
;    (not(divides? 400 year)) false
;    :else true
;    ))
; '_______'
