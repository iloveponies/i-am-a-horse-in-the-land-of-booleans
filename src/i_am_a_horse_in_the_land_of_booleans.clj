(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
(if (= x false) false (if (= x nil) false true)))

(defn abs [x]
   (if (< x 0)
    (* x -1)
    x))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true false))


(defn fizzbuzz [n]
   (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else         ""))

(defn teen? [age]
  (if (> age 12) (if (< age 20) true false) false))

(defn not-teen? [age]
  (if (teen? age) false true ))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* 2(count x))
   (vector? x) (* 2(count x))
   :else true)
  )

(defn leap-year? [year]
  (if (divides? 4 year) (if (divides? 100 year) (if (divides? 400 year) true false) true)  false))
