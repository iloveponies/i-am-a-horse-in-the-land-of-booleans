(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (> 0 x) (- x) x))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond (== 0 (mod n 15)) "gotcha!"
        (== 0 (mod n 5)) "buzz"
        (== 0 (mod n 3)) "fizz"        
        :else ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond (number? x) (* 2 x)
        (empty? x) nil
        (list? x) (* 2 (count x))
        (vector? x) (* 2 (count x))
        :else true))


(defn leap-year? [year]
  (cond (not (divides? 4 year)) false
        (not (divides? 100 year)) true
        (not (divides? 400 year)) false
        :else true))

; '_______'
