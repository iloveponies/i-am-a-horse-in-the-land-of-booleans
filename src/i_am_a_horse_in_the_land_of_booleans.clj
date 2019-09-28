(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false))
    false true))

(defn teen? [age]
  (if (and (>= age 13) (<= age 19))
    true false))

(defn sign [x]
  (if (< x 0) "-" "+"))

(defn abs [x]
  (int (Math/sqrt (* x x))))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""))

(defn not-teen? [age]
  (if (= (teen? age) false)
    true false))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* (count x) 2)
   :else true))

(generic-doublificate 1)
(generic-doublificate [1 2])
(generic-doublificate '(65 21))
(generic-doublificate {})
(generic-doublificate [])
(generic-doublificate {:a 1})


(defn leap-year? [year]
  (cond
   (= (divides? 4 year) false) false
   (= (divides? 100 year) false) true
   (= (divides? 400 year) false) false
   :else true))

(leap-year? 100)
(leap-year? 200)
(leap-year? 400)
(leap-year? 12)
(leap-year? 20)
(leap-year? 15)

; '_______'
