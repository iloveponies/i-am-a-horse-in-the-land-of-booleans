(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (= 0 (mod n divisor))
)

(defn fizzbuzz [n]
  (cond (zero? (mod n 15)) "gotcha!"
        (zero? (mod n 3)) "fizz"
        (zero? (mod n 5)) "buzz"
        :else ""
        ))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond (number? x) (* 2 x)
        (empty? x) nil
        (or (list? x) (vector? x)) (* 2 (count x))
        :else true
        ))

(defn leap-year? [year]
  (cond (not (divides? 4 year)) false
        (divides? 400 year) true
        (divides? 100 year) false
        :else true))


; '_______'
