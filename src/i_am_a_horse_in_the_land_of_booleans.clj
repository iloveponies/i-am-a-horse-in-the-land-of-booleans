(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (and (not= nil x) (not= false x)))

(defn abs [x] (if (< x 0) (- x) x))

(defn divides? [divisor n] (zero? (mod n divisor)))

(defn fizzbuzz [n]
  (let [three (divides? 3 n)
        five (divides? 5 n)]
    (cond (and three five) "gotcha!"
          three "fizz"
          five "buzz"
          :else "")))

(defn teen? [age] (<= 13 age 19))

(defn not-teen? [age] (not (teen? age)))

(defn generic-doublificate [x]
  (cond (number? x) (* 2 x)
        (empty? x) nil
        (or (list? x) (vector? x)) (* 2 (count x))
        :else true))

(defn leap-year? [year]
  (and (divides? 4 year)
       (or (divides? 400 year)
           (not (divides? 100 year)))))

; '_______'
