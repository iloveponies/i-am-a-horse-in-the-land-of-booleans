(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if x true false) )

(defn abs [x] (if (< x 0) (- x x x) x ))

(defn divides? [divisor n]
  (if(== (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n)  "buzz"
    (divides? 3 n)  "fizz"
    :else           ""))

(defn teen? [age] (if (< 12 age 20) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (+ x x)
    (empty? x)  nil
    (list? x)   (+ (count x) (count x))
    (vector? x) (+ (count x) (count x))
    :else       true))

(defn leap-year? [n]
  (cond
    (and(divides? 400 n)(divides? 100 n))     true
    (and(divides? 4 n)(not(divides? 100 n)))  true
    :else                                     false))



; '_______'
