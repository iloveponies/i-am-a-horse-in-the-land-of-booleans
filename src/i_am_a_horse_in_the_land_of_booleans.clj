(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (>= x 0)
    x
    (* -1 x)))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
   (= (mod n 15) 0) (str "gotcha!")
   (= (mod n 3) 0)  (str "fizz")
   (= (mod n 5) 0) (str "buzz")
   :else (str "")))

(defn teen? [age]
  (if (<= 13 age 19)
    true
    false))

(defn not-teen? [age]
  (if (not (<= 13 age 19))
    true
    false))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))


(defn leap-year? [year]
  (cond
   (and (= (mod year 100) 0) (= (mod year 400) 0)) true
   (and (= (mod year 100) 0) (not (= (mod year 400) 0))) false
   (= (mod year 4) 0) true
   :else false))


; '_______'
