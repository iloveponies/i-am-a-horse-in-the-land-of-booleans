(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (
    if x true false))

(defn abs [x]
  ( if(< 0 x) x (* x -1) ))

(defn divides? [divisor n]
  (if ( <(mod n divisor) 1) true false))

(defn fizzbuzz [n]
  (cond
    (<(mod n 15) 1) "gotcha!"
    (<(mod n 3) 1) "fizz"
    (<(mod n 5) 1) "buzz"

   :else ""))

(defn teen? [age]
  (if (< 12 age 20) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (list? x) (* (count x) 2)
    (vector? x) (* (count x) 2)
    :else true))

(defn leap-year? [year]
  (cond
    (>(mod year 4) 0) false
    (>(mod year 100) 0) true
    (>(mod year 400) 0) false
    :else true))


; '_______'
