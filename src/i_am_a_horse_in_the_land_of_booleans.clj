(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil) false
    (if (= x false) false
      true)))

(defn abs [x]
  (if (< x 0)
    (- 0 x)
    x))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false
    ))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))


(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (vector? x) (list? x)) (* 2 (count x))
    :else true))


(defn leap-year? [year]
  (cond
    (divides? 4 year)
    (cond
      (divides? 100 year) (if (divides? 400 year)
                            true
                            false)
      :else true)
    :else false))
