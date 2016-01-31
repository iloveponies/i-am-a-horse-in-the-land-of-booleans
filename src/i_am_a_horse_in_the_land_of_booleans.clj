(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil) false
    (if (= x false) false
        true)))

(defn abs [x]
    (if (> x 0) x (- x)))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true false))

(defn fizzbuzz [n]
  (cond
      (= 0 (mod n 15)) "gotcha!"
      (= 0 (mod n 3)) "fizz"
      (= 0 (mod n 5)) "buzz"
      :else ""))

(defn teen? [age]
    (if (<= 13 age 19) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
   (cond
       (number? x) (* 2 x)
       (empty? x) nil
       (list? x) (* 2 (count x))
       (vector? x) (* 2 (count x))
       :else true))

(defn leap-year-easy? [year]
  (cond
      (divides? 400 year) true
      (divides? 100 year) false
      (divides? 4 year) true
      :else false))

(defn leap-year? [year]
    (if
        (or
            (divides? 400 year)
            (and
                (divides? 4 year)
                (not (divides? 100 year))))
        true false))



; '_______'
