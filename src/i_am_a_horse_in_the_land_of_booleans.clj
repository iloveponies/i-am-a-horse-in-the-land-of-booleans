(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (>= x 0) x (* x -1)))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
    (= (mod n 15) 0) "gotcha!"
    (= (mod n 3) 0)  "fizz"
    (= (mod n 5) 0)  "buzz"
    :else ""))

(defn teen? [age]
  (if (>= age 13)
    (if (<= age 19)
      true false)
    false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (cond
    (not (= (mod year 4) 0)) false
    (= (mod year 100) 0)
      (if (= (mod year 400) 0) true false)
    :else true))

; '_______'
