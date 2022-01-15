(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (* -1 x) x))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else "")
  )

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (or (list? x) (vector? x)) (if (empty? x) nil (* (count x) 2))
    (and (map? x) (empty? x)) nil
    :else true
    )
  )

(defn leap-year? [year]
  (cond
    (divides? 400 year) true
    (divides? 100  year) false
    (divides? 4 year) true
    :else false
    )
  )

; '_______'
