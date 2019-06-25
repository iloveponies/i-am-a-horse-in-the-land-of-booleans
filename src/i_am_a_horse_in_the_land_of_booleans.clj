(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (not (or (= false x) (= nil x))))

(defn abs [x]
  (if (> x 0)
       x
       (* x -1)))

(defn divides? [divisor n]
  (= (mod n divisor) 0) )

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else   ""))

(defn teen? [age]
  (< 12 age 20))


(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (cond
   (not (divides? 4 year)) false
   (not (divides? 100 year)) true
   (not (divides? 400 year)) false
   :else true))

; '_______'
