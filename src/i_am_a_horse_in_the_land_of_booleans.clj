(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
    false
    (if (= x false)
      false true)))

(defn abs [x]
  (if (< x 0) (* x -1) x))

(defn divides? [divisor n]
    (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (coll? x) (if (empty? x) nil
      (cond
        (or (list? x) (vector? x)) (* (count x) 2)
        :else true
      ))
    :else true
   ))

(defn leap-year? [year]
  (if (divides? 100 year) (divides? 400 year) (divides? 4 year))
  )

; '_______'
