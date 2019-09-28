(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (< 0 x)
    x
    (- x)))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
   (== (mod n 15) 0) "gotcha!"
   (== (mod n 5) 0) "buzz"
   (== (mod n 3) 0) "fizz"
   :else ""))

(defn teen? [age]
  (if (< 12 age 20)
    true
    false))

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
  (if (not (= (mod year 4) 0))
    false
    (if (not (= (mod year 100) 0))
      true
      (if (not (= (mod year 400) 0))
        false
        true))))

; '_______'
