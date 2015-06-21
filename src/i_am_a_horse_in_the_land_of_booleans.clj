(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false)) false true)
  )

(defn abs [x]
  (if (< x 0) (* x -1) x)
  )

(defn divides? [divisor n]
  (== 0 (mod n divisor))
  )

(defn fizzbuzz [n]
  (cond
     (divides? 15 n) "gotcha!"
     (divides? 5 n) "buzz"
     (divides? 3 n) "fizz"
     :else ""
     )
  )

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
     (number? x) (* x 2)
     (empty? x) nil
     (or (list? x) (vector? x)) (* (count x) 2)
     :else true
   )
  )

(defn leap-year? [year]
  (cond
    (and (divides? 100 year) (divides? 400 year)) true
    (and (< year 100) (divides? 4 year)) true
    :else false
    )
  )

; '_______'
