(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x false) false (if (= x nil) false true)))
(boolean "foo")

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn teen? [age]
  (if (< 12 age 20) true false))


(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (if (number? x) (* 2 x)
    (if (empty? x) nil
      (if (or (vector? x) (list? x))
        (* 2 (count x)) true))))

(defn leap-year? [year]
  (if (divides? 4 year)
    (if (divides? 100 year)
      (if (divides? 400 year) true false)
    true)
  false))


; '_______'
