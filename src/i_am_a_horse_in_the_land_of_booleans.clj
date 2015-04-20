(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
    (= x false) false
    (= x nil) false
    :else true))

(defn abs [x]
  (if (< x 0) (* x -1) x))

(defn divides? [divisor n]
  (if (= 0 divisor) false
      (if (= 0 (mod n divisor))
        true
        false)))

(defn fizzbuzz [n]
  (cond
    (= 0 (mod n 15)) "gotcha!"
    (= 0 (mod n 5)) "buzz"
    (= 0 (mod n 3)) "fizz"
    :else ""))

(defn teen? [age]
  (if (< age 20)
    (if (> age 12) true false)
    false))

(defn not-teen? [age]
  (if (teen? age) false true))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))



(defn leap-year? [year]
  (cond
    (and (= 0 (mod year 100)) (not (= 0 (mod year 400)))) false
    (= 0 (mod year 4)) true
    :else false))

; '_______'
