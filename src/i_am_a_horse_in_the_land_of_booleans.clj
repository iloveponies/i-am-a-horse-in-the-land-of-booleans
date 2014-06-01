(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) 
    (* x -1) 
    x))

(defn divides? [divisor n]
  (zero? (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (list? x)(vector? x)) (generic-doublificate (count x))
    :else true))

(defn leap-year? [year]
  (and (divides? 4 year) 
       (not (and (divides? 100 year)
                 (not (divides? 400 year))))))

; '_______'
