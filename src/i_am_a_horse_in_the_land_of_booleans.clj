(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if (or (= x false) (nil? x)) false true))

(defn abs [x] (if (< x 0) (* -1 x) x))

(defn divides? [a b] (== 0 (mod b a)))

(defn fizzbuzz [n]
 (cond
  (divides? 15 n) "gotcha!"
  (divides? 3 n) "fizz"
  (divides? 5 n) "buzz"
  :else ""))

(defn teen? [age] (< 12 age 20))

(defn not-teen? [age] (not (teen? age)))

(defn generic-doublificate [x]
 (cond
  (number? x) (* 2 x)
  (empty? x) nil
  (not (or (vector? x) (list? x))) true
  :else (* 2 (count x))))

(defn leap-year? [x]
 (cond
  (not (divides? 4 x)) false
  (divides? 400 x) true
  (divides? 100 x) false
  :else true))

; '_______'
