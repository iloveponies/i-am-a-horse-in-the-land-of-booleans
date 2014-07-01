(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
    (- x)
    (+ x)))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    (boolean true)
    (boolean false)))

(defn fizzbuzz [n]
  (cond
   (zero? (mod n 15)) "gotcha!"
   (zero? (mod n 3)) "fizz"
   (zero? (mod n 5)) "buzz"
   :else ""))

(defn teen? [age]
  (if (and (>= age 13) (<= age 19))
    true
    false))

(defn not-teen? [age]
  (if (not (or (> age 19) (< age 13)))
    (boolean false)
    (boolean true)))

(defn generic-doublificate [x]
  (cond
   (number? x) (+ x x)
   (empty? x)  nil
   (or (list? x) (vector? x)) (* (count x) 2)
   :else true))

(defn leap-year? [year]
  (cond
   (zero? (mod year 400)) true
   (zero? (mod year 100)) false
   (zero? (mod year 4)) true
   :else false))

; '_______'
