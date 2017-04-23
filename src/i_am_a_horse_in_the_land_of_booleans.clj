(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
    false
    (if (= x false) false true)))

(defn abs [x]
  (if (> 0 x)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (= 0 (mod n 15)) "gotcha!"
    (= 0 (mod n 5)) "buzz"
    (= 0 (mod n 3)) "fizz"
    :else ""))

(defn teen? [age]
  (= (> 20 age) (< 12 age)))

(defn not-teen? [age]
  (if (teen? age)
    false
    true))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (if (and (= 0 (mod year 4))
           (if (= 0 (mod year 100))
             (if (= 0 (mod year 400))
               true
               false)
             true))
    true
    false))

; '_______'
