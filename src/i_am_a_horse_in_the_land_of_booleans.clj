
(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (nil? x) (false? false))
    false
    true))

(defn abs [x]
  (if (< x 0)
    (* x -1)
    x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond (divides? n 3) "fizz"
        (divides? n 5) "buzz"
        (divides? n 15) "gotcha!"
        :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond (number? x) (* x 2)
        (empty? x) nil
        (or (list? x)
            (vector? x)) (* (count x) 2)
          :else true))

(defn leap-year? [year]
  (cond (not= (mod year 4) 0) false
        (not= (mod year 100) 0) false
        (not= (mod year 400) 0) false
        :else true))

; '_______'
