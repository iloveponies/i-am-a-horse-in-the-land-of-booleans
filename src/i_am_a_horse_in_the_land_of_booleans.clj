(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))


(defn abs [x]
 (if (< x 0)
   (- x)
     x))


(defn divides? [divisor n]
  (= (mod n divisor) 0))


(defn fizzbuzz [n]
  (cond
  (divides? 15 n) (str "gotcha!")
  (divides? 5 n) (str "buzz")
  (divides? 3 n) (str "fizz")
  :else (str "")))


(defn teen? [age]
   (< 12 age 20))


(defn not-teen? [age]
  (not (teen? age)))


(defn generic-doublificate [x]
   (cond
    (number? x) (* x 2)
    (empty? x) nil
    (list? x) (* (count x) 2)
    (vector? x) (* (count x) 2)
    :else (boolean true)))


(defn leap-year? [year]
  (cond
   (divides? 400 year) (boolean true)
   (divides? 100 year) (boolean false)
   (divides? 4 year) (boolean true)
   :else (boolean false)))

; '_______'
