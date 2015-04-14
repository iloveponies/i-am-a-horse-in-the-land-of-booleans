(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
    (- 0 x)
    x))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n)  "fizz"
    (divides? 5 n)  "buzz"
    :else           ""))


(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (and (empty? x) (or (list? x) (vector? x) (map? x))) nil
    (and (not (empty? x)) (or (list? x) (vector? x))) (* 2 (count x))
    ;(and (not (empty? x)) (map? x)) (count (keys x))
    true true))

(defn leap-year? [year]
  (cond
    (not (divides? 4 year)) false
    (not (divides? 100 year)) true
    (not (divides? 400 year)) false
    true true))


; '_______'

(generic-doublificate 1)        ;=> 2
(generic-doublificate [1 2])    ;=> 4
(generic-doublificate '(65 21)) ;=> 4
(generic-doublificate {})       ;=> nil
(generic-doublificate [])       ;=> nil
(generic-doublificate {:a 1})   ;=> true
