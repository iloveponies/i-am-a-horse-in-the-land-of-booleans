(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean])
  )

(defn boolean [x]
  (if (= x false)
    false
    (if (= x nil)
      false
      true)))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (== (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
     (divides? 15 n) "gotcha!"
     (divides? 3 n) "fizz"
     (divides? 5 n) "buzz"
     :else ""
    ))

(defn teen? [age]
  (> 20 age 12))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true
    ))

(defn leap-year? [year]
  (cond
    (and (= (mod year 100) 0) (not (= (mod year 400) 0)) ) false
    (not (= (mod year 4) 0)) false
    :else true
    ))

; '_______'
