(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
    false
    (if (= x false)
    false
    true)))

(defn abs [x]
  (if (< x 0)
    (- 0 x)
    (+ 0 x)))

(defn divides? [divisor n]
  (if (> (mod n divisor) 0)
    false
    true))

(defn fizzbuzz [n]
  (cond
   (== (mod n 15) 0) "gotcha!"
   (== (mod n 5) 0) "buzz"
   (== (mod n 3) 0) "fizz"
   :else ""))

(defn teen? [age]
  (if (< age 13)
    false
    (if (<= age 19)
      true
      false)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (cond
   (not (divides? 4 year)) false
   (not (divides? 100 year)) true
   (not (divides? 400 year)) false
   :else true))

; '_______'
