(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (nil? x) (false? x))
    false
    true))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond (= (mod n 15) 0) "gotcha!"
        (= (mod n 3) 0) "fizz"
        (= (mod n 5) 0) "buzz"
        :else ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (if (not (teen? age))
    true
    false))

(defn generic-doublificate [x]
  (cond (number? x) (* x 2)
        (empty? x) nil
        (or (list? x) (vector? x)) (* 2 (count x))
        :else true))


(defn leap-year? [year]
  (cond (not (= (mod year 4) 0)) false
        (and (= (mod year 100) 0)
             (not (= (mod year 400) 0))) false
        :else true))

; '_______'
