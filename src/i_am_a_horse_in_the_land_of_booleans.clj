(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false))false true))

(defn abs [x]
  (if (>= x 0)
    x
    (* x -1)))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
   (= (mod n 15) 0) "gotcha!"
   (= (mod n 5) 0) "buzz"
   (= (mod n 3) 0) "fizz"
   :else ""))

(defn teen? [age]
  (if (and (number? age) (>= age 13) (<= age 19))
    true
    false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (and (coll? x) (empty? x)) nil
   (or (list? x) ( vector? x)) (generic-doublificate (count x))
   :else true))

(defn leap-year? [year]
  ":(")

; '_______'
