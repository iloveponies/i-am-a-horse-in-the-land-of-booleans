(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (* -1 x) x))

(defn divides? [divisor n]
   (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
   (= (mod n 15) 0) "gotcha!"
   (= (mod n 3) 0) "fizz"
   (= (mod n 5) 0) "buzz"
   :else ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (or (> age 19) (> 13 age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (or
   (= 0 (mod year 4) (mod year 100) (mod year 400))
   (and (= 0 (mod year 4)) (not(= 0 (mod year 100))))
   ))
















; '_______'
