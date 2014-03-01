(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (cond
                     (nil? x) false
                     (= false x) false
                     :else true))

(defn abs [x] (cond
                 (neg? x) (- 0 x)
                 :else x))

(defn divides? [divisor n] (= 0 (rem n divisor))) 

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n)  "fizz"
    (divides? 5 n)  "buzz"
    :else           ""))

(defn teen? [age] (< 12 age 20))

(defn not-teen? [age] (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x)  nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))

(defn leap-year? [year] 
    (cond
       (divides? 400 year) true
       (divides? 100 year) false
       (divides? 4 year)   true
       :else false))

; '_______'
