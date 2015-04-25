(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
  false
  (if (= x false)
    false
    true)))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (== (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""
   ))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   :else true
   ))

(defn divisible-by-four? [x]
  (divides? 4 x))

(defn divisible-by-hundred? [x]
  (divides? 100 x))

(defn divisible-by-four-hundred? [x]
  (divides? 400 x))

(defn leap-year? [year]
  (if (divisible-by-four? year)
    (if (divisible-by-hundred? year)
      (divisible-by-four-hundred? year)
      true)
    false))
