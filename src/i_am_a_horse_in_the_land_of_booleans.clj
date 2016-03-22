(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil) false (if (= x false) false true))
  )

(defn abs [x]
  (if (< x 0) (* -1 x) x))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor)) true false))

(defn fizzbuzz [n]
  (cond (divides? 15 n) "gotcha!"
        (divides? 5 n) "buzz"
        (divides? 3 n) "fizz"
        :else ""))

(defn teen? [age]
  (if (> age 12) (if (< age 20) true false) false)
  )

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond (number? x) (* x 2)
        (empty? x) nil
        (list? x) (* (count x) 2)
        (vector? x) (* (count x) 2)
        :else true))

(defn leap-year? [year]
  (cond (divides? 400 year) true
        (divides? 100 year) false
        (divides? 4 year) true
        :else false))

; '_______'
