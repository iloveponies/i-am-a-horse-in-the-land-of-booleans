(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  "mimics the builtin boolean"
  (if (= x false) false
      (if (= x nil) false
          true)))

(defn abs [x]
  (if (> 0 x)
    (* x -1)
    x))

(defn divides? [divisor n]
  (= 0 (rem n divisor)))

(defn fizzbuzz [n]
  (cond
        (divides? 15 n) "gotcha!"
        (divides? 3 n) "fizz"
        (divides? 5 n) "buzz"
        :else ""))

(defn teen? [age]
  (>= 19 age 13))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (and (coll? x) (= 0 (count x))) nil
    (or (vector? x) (list? x)) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (and
   (divides? 4 year)
   (or
    (not (divides? 100 year))
    (and (divides? 100 year) (divides? 400 year)))))

; '_______'
