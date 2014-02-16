(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false
  ))

(defn abs [x]
  (if (< x 0)
    (- 0 x)
    x))

(defn divides? [divisor n]
  (= 0 (mod n divisor))
  )

(defn fizzbuzz [n]
  (cond
     (divides? 15 n) "gotcha!"
     (divides? 3 n) "fizz"
     (divides? 5 n) "buzz"
     :else ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
     (number? x) (* x 2)
     (empty? x) nil
     (list? x) (* 2 (count x))
     (vector? x) (* 2 (count x))
     :else true
   ))

(defn leap-year? [year]
  (cond
     (and (divides? 4 year)
          (divides? 100 year)
          (divides? 400 year)) true
     (and (divides? 4 year)
          (divides? 100 year)) false
     (and (divides? 4 year)) true
     :else false
   )
  )

; '_______'
