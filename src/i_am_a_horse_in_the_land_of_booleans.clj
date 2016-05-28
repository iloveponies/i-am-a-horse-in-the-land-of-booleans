(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean
  [x]
    (if x true false))

(defn abs
  [x]
  (if (> x 0)
     x
    (- x)))

(defn divides?
  [divisor n]
   (if (== 0 (mod n divisor))
      true
      false))

(defn fizzbuzz
  [n]
    (cond
    (== 0 (mod n 15)) "gotcha!"
    (== 0 (mod n 3)) "fizz"
    (== 0 (mod n 5)) "buzz"
    :else ""))


(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (if (not (teen? age))
    true
    false))

(defn generic-doublificate
  [x]
    (cond
       ; return doubles if number
       (number? x) (* x 2)
       ; return nil if empty collection
       (empty? x) nil
       ; return 2x length if list or vector
       (list? x) (* (count x) 2)
       (vector? x) (* (count x) 2)
       ; return true
       :else true))

(defn leap-year? [year]
  (cond
    (not (== 0 (mod year 4))) false
    (not (== 0 (mod year 100))) true
    (not (== 0 (mod year 400))) false
    :else true))

; '_______'



