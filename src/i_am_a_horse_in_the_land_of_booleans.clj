(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
     (- x)
     x))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor))
      true
      false))

(defn fizzbuzz [n]
  (cond
   (== 0 (mod n 15)) "gotcha!"
   (== 0 (mod n 3)) "fizz"
   (== 0 (mod n 5)) "buzz"
   :else            ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (or (> 13 age) (< 19 age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x)  nil
   (or (list? x) (vector? x))   (* 2 (count x))
   :else       true))

(defn leap-year? [year]
  (cond
   (== 0 (mod year 400)) true
   (and (== 0 (mod year 4)) (not (== 0 (mod year 100)))) true
   :else       false))

; '_______'
