(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond 
    (or (= x nil) (= x false)) false
    :else true))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond 
    (= (mod n 15)0) "gotcha!"
    (= (mod n 3) 0) "fizz"
    (= (mod n 5) 0) "buzz"
    :else ""))

(defn teen? [age]
  (if (>= age 13)
    (if (<= age 19)
      true
      false)
    false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (cond 
    (not (= 0 (mod year 4))) false
    (not (= 0 (mod year 100))) true
    (not (= 0 (mod year 400))) false
    :else true))

; '_______'
