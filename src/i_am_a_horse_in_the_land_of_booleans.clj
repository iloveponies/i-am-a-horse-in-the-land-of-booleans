(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (and (not (= false x)) (not (= nil x)))
          true
          false))

(defn abs [x]
  (if (> x 0)
    x
    (* x -1)))


(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
         true
         false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""))

(defn teen? [age]
  (if (and (>= age 13) (<= age 19))
    true
    false))

(defn not-teen? [age]
  (if (not (teen? age))
      true
      false))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (or (list? x) (vector? x)) (* (count x) 2)
   :else true))

(defn leap-year? [year]
  (cond
   (divides? 400 year) true
   (and (divides? 4 year) (not (divides? 100 year))) true
   :else false))

(leap-year? 100) ;=> false
(leap-year? 200) ;=> false
(leap-year? 400) ;=> true
(leap-year? 12)  ;=> true
(leap-year? 20)  ;=> true
(leap-year? 15)  ;=> false
; '_______'
