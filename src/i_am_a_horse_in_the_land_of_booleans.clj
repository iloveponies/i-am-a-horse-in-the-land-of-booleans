(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [n divisor]
  (boolean (== (mod divisor n) 0)))

(defn fizzbuzz [x]
  (cond
   (divides? 15 x) "gotcha!"
   (divides? 3 x) "fizz"
   (divides? 5 x) "buzz"
   :else ""))


(defn teen? [age]
  (> 20 age 12))

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
  (and
   (divides? 4 year)
   (or
    (not (divides? 100 year))
    (divides? 400 year))))

; '_______'




(boolean "foo")


(abs 2)

(divides? 5 10)

(fizzbuzz 40)

(generic-doublificate [(range 10)])

(not-teen? 13)

(leap-year? 15)