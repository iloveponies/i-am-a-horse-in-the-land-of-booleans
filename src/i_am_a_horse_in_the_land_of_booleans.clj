(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn teen? [age]
  (<= 13 age 19))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn abs [numb]
  (if (< numb 0)
    (- numb)
    numb))


(defn not-teen? [age]
  (not (teen? age)))


(defn generic-doublificate [x]
  (cond
   (number? x) (+ x x)
   (and (coll? x) (empty? x)) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (or (and (divides? 4 year) (not (divides? 100 year)))
      (and (divides? 4 year) (divides? 400 year))))



; '_______'
