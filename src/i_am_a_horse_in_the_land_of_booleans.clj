(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false))
     false
     true))

(defn abs [x]
  (if (< x 0)
    (* x -1)
    x))

(defn divides? [divisor n]
  (-> n (mod divisor) (= 0)))

(defn fizzbuzz [n]
  (cond
    (-> n (mod 15) (= 0)) "gotcha!"
    (-> n (mod 5) (= 0))  "buzz"
    (-> n (mod 3) (= 0))  "fizz"
    :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (-> (count x) (* 2))
    :else true))

(defn leap-year? [year]
  (cond
    (-> year (mod 400) (= 0)) true
    (and (-> year (mod 4) (= 0))
         (-> year (mod 100) (not= 0))) true
    :else false))

; '_______'
