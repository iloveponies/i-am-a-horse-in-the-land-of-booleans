(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (not (or (= nil x)(= false x))))

; what!
(defn abs [x]
  (if (< x 0)(unchecked-negate-int x)x))

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (= true (divides? 15 n)) "gotcha!"
    (= true (divides? 3 n)) "fizz"
    (= true (divides? 5 n)) "buzz"
    :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x)  nil
    (map? x)    true
    (or (list? x)(vector? x)) (* 2 (count x))))

(defn leap-year? [year]
  (cond
    (= 0 (mod year 400)) true
    (= 0 (mod year 100)) false
    (= 0 (mod year 4)) true
    :else false))

; '_______'
