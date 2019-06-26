(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if x true false))


(defn abs [x] (if (< x 0) (- x) x))

(defn divides? [divisor n] (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
     :else         ""))

(defn teen? [age] (if (< 12 age 20) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* (count x) 2)
   (vector? x) (* (count x) 2)
   :else     true
   ))

(defn leap-year? [year]
  (if (divides? 4 year) (if (divides? 100 year) (if (divides? 400 year) true false) true) false)
  )



(boolean nil)
(teen? 20)
(abs 2)
(divides? 4 2)
(fizzbuzz 70)
(generic-doublificate [65,21])
(generic-doublificate {:a,1})
(not-teen? 19)
(leap-year? 12)
