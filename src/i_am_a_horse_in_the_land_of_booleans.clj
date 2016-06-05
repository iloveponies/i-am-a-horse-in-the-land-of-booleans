(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false))
    false
    true))

(defn abs [x]
  (if (pos? x) 
    x
    (* x -1)))

(defn divides? [divisor n]
  (= 0 (rem n divisor)))

(defn fizzbuzz [n]
  (cond
    (= 0 (rem n 15)) "gotcha!"
    (= 0 (rem n 5)) "buzz"
    (= 0 (rem n 3)) "fizz"
    :else ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (if (= 0 (rem year 4))
    (if (= 0 (rem year 100))
      (if (= 0 (rem year 400))
        true
        false)
      true)
    false))

; '_______'
