(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false))
    false
    true))

(defn abs [x]
  (if (< x 0)
    (- x)
       x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
   (== (mod n 15) 0) "gotcha!"
   (== (mod n 5) 0)  "buzz"
   (== (mod n 3) 0)  "fizz"
   :else             ""))

(defn teen? [age]
  (if (and (>= age 13) (<= age 19))
           true
           false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x)      (* x 2)
   (empty? x)       nil
   (or (list? x)
       (vector? x)) (* (count x) 2)
   :else            true))

(defn leap-year? [year]
  (cond
    (== (mod year 400) 0) true
    (== (mod year 100) 0) false
    (== (mod year 4) 0)   true
    :else                 false))

; '_______'

(leap-year? 100) ;=> false
(leap-year? 200) ;=> false
(leap-year? 400) ;=> true
(leap-year? 12)  ;=> true
(leap-year? 20)  ;=> true
(leap-year? 15)  ;=> false


