(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (nil? x) (false? x))
    false
    true))

(defn abs [x]
  (if (< 0 x)
    x
    (* x -1)))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
   (= (mod n 15) 0) "gotcha!"
   (= (mod n 5) 0) "buzz"
   (= (mod n 3) 0) "fizz"
   :else ""))

(defn teen? [age]
  (if (and (number? age) (< 12 age 20))
       true
       false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (and (coll? x) (empty? x)) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (or (and (= (mod year 100) (mod year 400) 0))
      (and (not (= (mod year 100) 0)) (= (mod year 4) 0))))
; '_______'
