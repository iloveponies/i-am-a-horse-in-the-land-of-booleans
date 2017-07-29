(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if(= x nil) false (if (= x false) false true)))

(defn abs [x]
  (if(< x 0) (- x) x))

(defn divides? [divisor n]
  (if(== 0 (mod n divisor)) true false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""
  ))


(defn teen? [age]
  (if(< 12 age 20) true false))

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'

;
