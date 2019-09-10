(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (nil? x) (false? x)) false true))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor)) true false))

(defn fizzbuzz [n]
  (cond
   (and (divides? 3 n) (divides? 5 n)) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""
   ))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (and (coll? x) (empty? x)) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true
))

(defn leap-year? [year]
  (let [by-4 (divides? 4 year)
        by-100 (divides? 100 year)
        by-400 (divides? 400 year)]
    ;(println year by-4 by-100 by-400)
    (cond
     (not by-4) false
     (and by-4 by-100 by-400) true
     (and by-100 by-4) false
     (true? by-4) true
     :else false
     )
    )
  )

; '_______'
