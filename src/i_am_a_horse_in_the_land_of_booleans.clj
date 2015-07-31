
(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))


(defn boolean [x]
  (if x true false))

(defn abs [x] (if (< x 0) (* x -1) x))

(defn divides? [divisor n];mod == java '%'
  (if (= (mod n divisor) 0)
    true false))

(defn fizzbuzz [n]
  (cond
    (= (mod n 15) 0) "gotcha!"
    (= (mod n 5) 0) "buzz"
    (= (mod n 3) 0) "fizz"
    :else ""))

(defn teen? [age]
  (if
    (and (< age 20) (> age 12))
    true false))

(defn not-teen? [age]
  (if (teen? age) false true))

(defn generic-doublificate [x]
  (cond
    (number? x)
    (* x 2)
    (or (list? x) (vector? x))
    (if (= (count x) 0)
      nil
      (* 2 (count x)))
    (coll? x)
    (if (= (count x) 0)
      nil
      true)
    :else
    true))

(defn leap-year? [year]
  (cond
    (= (mod year 400) 0) true
    (= (mod year 100) 0) false
    (= (mod year 4) 0) true
    :else false))