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
    (- x)
    x))

(defn divides? [divisor n]
  (== 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
   (== 0 (mod n 15)) "gotcha!"
   (== 0 (mod n 3)) "fizz"
   (== 0 (mod n 5)) "buzz"
   :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (if (< age 13)
    true
    (if (> age 19)
      true
      false)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  ;; if year is not divisible by 4 then common year
  ;; else if year is not divisible by 100 then leap year
  ;; else if year is not divisible by 400 then common year
  ;; else leap year
  (cond
   (not= 0 (mod year 4)) false
   (not= 0 (mod year 100)) true
   (not= 0 (mod year 400)) false
   :else true))

; '_______'
