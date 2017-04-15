(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (let [fizz (divides? 3 n)
        buzz (divides? 5 n)]
    (cond (and fizz buzz) "gotcha!"
          fizz            "fizz"
          buzz            "buzz"
          :else           "")))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond (number? x)
          (* 2 x)
        (and (coll? x) (empty? x))
          nil
        (or (list? x) (vector? x))
          (* 2 (count x))
        :else
          true))

(defn leap-year? [year]
  (and (divides? 4 year)
       (or (not (divides? 100 year))
           (divides? 400 year))))

; '_______'
